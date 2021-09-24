-- SELECT WITH CASE --
SELECT IBGE7, UF, Municipio,
CASE Capital
	WHEN 'NULL' then 0
	ELSE 1
END AS CapitalBi0074
FROM Lista_Municipios_IBGE_Brasil
GO

CREATE TABLE Novo_Conjunto_Municipio_IBGE(
	MunicipioID INT NOT NULL,
	Descricao VARCHAR(MAX) NOT NULL,
	IBGE INT NOT NULL,
	IBGE7 INT NOT NULL,
	UFID INT NOT NULL,
	SiglaUF CHAR(2) NOT NULL,
	Regiao VARCHAR(50) NOT NULL,
	Populacao2010 INT NOT NULL,
	Porte VARCHAR(50) NOT NULL,
	Capital BIT NOT NULL, 
	)
GO

	-- INSERT DO NOVO CONJUNTO --
INSERT INTO Novo_Conjunto_Municipio_IBGE(MunicipioID, Descricao, IBGE, IBGE7, UFID, SiglaUF, Regiao, Populacao2010, Porte, Capital)
SELECT
Dados.MunicipioID,
Dados.Nome,
Lista.IBGE,
Dados.IBGE7,
Dados.UFID,
Dados.UF,
Lista.Regiao,
CAST(Lista.Populacao_2010 AS INT) AS Populacao,
Lista.Porte,
CASE Lista.Capital
	WHEN 'NULL' then 0
	ELSE 1
END AS CapitalBit
FROM [dbo].[Dados-Municipios-IBGE7] AS Dados INNER JOIN
[dbo].[Lista_Municipios_IBGE_Brasil] AS Lista ON Lista.IBGE7 = Dados.IBGE7
ORDER BY Dados.MunicipioID
GO

	-- SELECT --
SELECT IBGE7, UF, Municipio, CAST(Populacao_2010 AS INT) AS Populacao
FROM Lista_Municipios_IBGE_Brasil
WHERE (Populacao_2010 = '0')
GO

	-- UPDATE --
UPDATE Lista_Municipios_IBGE_Brasil 
SET Capital = '0'
WHERE (Capital = 'NULL')
GO

	-- SELECT --
SELECT
Dados.MunicipioID,
Dados.Nome,
Lista.IBGE,
Dados.IBGE7,
Dados.UFID,
Dados.UF,
Lista.Regiao,
Lista.Populacao_2010,
Lista.Porte,
Lista.Capital
FROM [dbo].[Dados-Municipios-IBGE7] AS Dados INNER JOIN
[dbo].[Lista_Municipios_IBGE_Brasil] AS Lista ON Lista.IBGE7 = Dados.IBGE7
ORDER BY Dados.MunicipioID
GO




-- SELECT COM O NOVO CONJUNTO --
SELECT
Conjunto.MunicipioID,
Conjunto.Descricao,
Conjunto.Capital,
Lista.MicroregiaoID,
Conjunto.UFID,
Lista.MesoregiaoID,
Conjunto.SiglaUF,
Conjunto.Regiao,
Conjunto.Populacao2010,
Conjunto.Porte,
Conjunto.IBGE,
Conjunto.IBGE7
FROM [dbo].[Novo_Conjunto_Municipio_IBGE] AS Conjunto
INNER JOIN Lista_Municipios_Complementar_IBGE AS Lista
ON Conjunto.IBGE7 = Lista.CodigoIBGE
GO




	-- CRIAÇÃO DA TABELA Município --
CREATE TABLE Municipio(MunicipioID INT NOT NULL IDENTITY(1,1), Nome VARCHAR(MAX), IBGE INT NOT NULL, IBGE7 INT NOT NULL, MicroregiaoID INT NOT NULL, UFID INT NOT NULL, MesoregiaoID INT NOT NULL, SiglaUF CHAR(2), Regiao VARCHAR(MAX), Populacao2010 INT, Porte VARCHAR(50), Capital BIT,
DataInsert datetime NULL DEFAULT GETDATE(),
CONSTRAINT Pk_Municipio PRIMARY KEY (MunicipioID)
)
GO


-- INSERÇÃO NA TABELA Municipio --
	
SET IDENTITY_INSERT Municipio ON


INSERT INTO Municipio(MunicipioID, Nome, IBGE, IBGE7, MicroregiaoID, UFID, MesoregiaoID, SiglaUF, Regiao, Populacao2010, Porte, Capital)
SELECT
Conjunto.MunicipioID,
Conjunto.Descricao,
Conjunto.IBGE,
Conjunto.IBGE7,
Lista.MicroregiaoID,
Conjunto.UFID,
Lista.MesoregiaoID,
Conjunto.SiglaUF,
Conjunto.Regiao,
Conjunto.Populacao2010,
Conjunto.Porte,
Conjunto.Capital
FROM [dbo].[Novo_Conjunto_Municipio_IBGE] AS Conjunto
INNER JOIN Lista_Municipios_Complementar_IBGE AS Lista
ON Conjunto.IBGE7 = Lista.CodigoIBGE
ORDER BY Lista.MunicipioID


SET IDENTITY_INSERT Municipio OFF
GO

















