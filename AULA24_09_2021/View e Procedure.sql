--  Criando a VIEW para Funcionario --
CREATE VIEW ExibeFuncionario
AS
SELECT Funcionario.*, Pais.Nome AS NomePais FROM Funcionario
INNER JOIN Pais
ON Funcionario.Paisid = Pais.PaisID

--  Criando a VIEW para Empresa --
CREATE VIEW ExibeEmpresa
AS
SELECT FuncionarioID, Chave, DataAdmissao, Ctps, CtpsNum, CtpSerie FROM Funcionario

-- Cria��o da Procedure para buscar Funcion�rio --
CREATE PROCEDURE BuscaFuncionario
@FuncionarioID INT
AS
SELECT * FROM Funcionario
WHERE (@FuncionarioID = Funcionario.FuncionarioID)

-- Cria��o da Procedure para buscar Funcion�rio pela chave --
CREATE PROCEDURE BuscaFuncionarioChave
@FuncionarioChave BIGINT
AS
SELECT * FROM Funcionario
WHERE (Funcionario.Chave = @FuncionarioChave)