# DevAgro

Contatos:
WhatsApp: 51 984065069.

E-mail: rodrigobl1@yahoo.com.br.

Linkedin: https://www.linkedin.com/in/rodrigo-blw/

°•._______{°-°}________.•°



# INSERTS


insert into empresa (cnpj, endereco, nome) 
values 
('04.097.376/0001-17', 'Rua Joana 123', 'Empresa 1'),
('04.097.376/0001-17', 'Rua Joana 123', 'Empresa 2'),
('04.097.376/0001-17', 'Rua Joana 123', 'Empresa 3'),
('04.097.376/0001-17', 'Rua Joana 123', 'Empresa 4'),
('04.097.376/0001-17', 'Rua Joana 123', 'Empresa 5');

insert into grao(nome, tempo_colheita, empresa) 
values
('Milho', '100', '1'),
('Trigo', '100', '1'),
('Arroz', '100', '2'),
('Feijão', '100', '2'),
('Uva', '100', '3'),
('Laranja', '100', '3'),
('Mamao', '100', '4'),
('Azeitona', '100', '4'),
('Mandioca', '100', '5'),
('Pera', '100', '5');

insert into funcionario (cpf, endereco, telefone, data_nascimento, nome, sexo, sobrenome, empresa) 
values 
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 1', 'M', 'Silva', '1'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 2', 'M', 'Silva', '2'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 3', 'M', 'Silva', '3'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 4', 'M', 'Silva', '4'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 5', 'M', 'Silva', '5'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 6', 'M', 'Silva', '1'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 7', 'M', 'Silva', '2'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 8', 'M', 'Silva', '3'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 9', 'M', 'Silva', '4'),
('741.663.330-38', 'Rua Joana 123', '04833456598', '1999/10/10', 'Funcionario 10', 'M', 'Silva', '5');

insert into fazenda (endereco_fazenda, estoque_inicial, nome, ultima_colheita, empresa, grao, data_proxima_colheita) 
values 
('rua ABC 121', '500', 'Rancho Velho', '2022/01/01', '1', '10',' 2022/08/01'),
('rua ABC 121', '1500', 'Rancho ', '2022/01/01', '1', '9',' 2022/08/10'),
('rua ABC 121', '2000', 'Rancho Novo', '2022/01/01', '2', '8',' 2022/08/20'),
('rua ABC 121', '2500', 'Rancho Medio', '2022/01/01', '2', '7',' 2022/08/15'),
('rua ABC 121', '3000', 'Rancho Azul', '2022/01/01', '3', '6',' 2022/08/25'),
('rua ABC 121', '3500', 'Rancho Verde', '2022/01/01', '3', '5',' 2022/08/01'),
('rua ABC 121', '4000', 'Rancho Grande', '2022/01/01', '4', '4',' 2022/08/10'),
('rua ABC 121', '4500', 'Rancho Pequeno', '2022/01/01', '4', '3',' 2022/08/20'),
('rua ABC 121', '5000', 'Rancho Alto', '2022/01/01', '5', '2',' 2022/08/15'),
('rua ABC 121', '5500', 'Rancho Baixo', '2022/01/01', '5', '1',' 2022/08/25');
