-- Inserindo os Dados na Tabela Departamento --
SET IDENTITY_INSERT Departamento ON
INSERT INTO Departamento(DepID, Nome)
SELECT * FROM [dbo].[RAWDATA-Departamentos]
SET IDENTITY_INSERT Departamento OFF
GO

-- Inserindo os Dados na Tabela Pais --
SET IDENTITY_INSERT Pais ON
INSERT INTO Pais(PaisID, Nome, Sigla)
SELECT * FROM [dbo].[RAW DATA - Pais]
SET IDENTITY_INSERT Pais OFF
GO
-- Inserindo na tabela Funcionario --
INSERT INTO Funcionario(FuncionarioID, Chave, Nome, Sobrenome, Sexo, DataNascimento, Email, PaisID, DataAdmissao, Ctps, CtpsNum, CtpSerie)
SELECT
DadosPessoais.funcid,
DadosPessoais.chave,
DadosPessoais.nome,
DadosPessoais.sobrenome,
DadosPessoais.sexo,
DadosPessoais.datanascimento,
DadosPessoais.email,
DadosPessoais.paisid,
DadosEmpresa.dataadmissao,
DadosEmpresa.ctps,
DadosEmpresa.ctpsnum,
DadosEmpresa.ctpsserie
FROM [dbo].[RAWDATA-Funcionarios-DadosPessoais] AS DadosPessoais
INNER JOIN [dbo].[RAWDATA-Funcionarios-DadosEmpresa] AS DadosEmpresa
ON DadosPessoais.chave = DadosEmpresa.chave



