-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 06-Mar-2018 às 11:46
-- Versão do servidor: 10.1.13-MariaDB
-- PHP Version: 5.6.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `controle_patrimonio`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `patrimonio`
--

CREATE TABLE `patrimonio` (
  `cod_patrimonio` int(11) NOT NULL,
  `num_proc_entrada` int(11) NOT NULL,
  `num_nota_fiscal` int(11) NOT NULL,
  `nome_patrimonio` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `marca_patrimonio` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `descricao_patrimonio` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `modelo_patrimonio` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `num_serie_patrimonio` int(11) NOT NULL,
  `valor_patrimonio` float NOT NULL,
  `mod_aqu_patrimonio` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `local_patrimonio` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `baixa_patrimonio` bit(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `login_usuario` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `senha_usuario` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `conf_senha_usuario` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nome_usuario` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `funcao_usuario` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cell_usuario` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `nivel_Acesso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`login_usuario`, `senha_usuario`, `conf_senha_usuario`, `nome_usuario`, `funcao_usuario`, `cell_usuario`, `nivel_Acesso`) VALUES
('admin', 'admin', 'admin', 'Admin', 'Administrador', '(19) 999999999', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patrimonio`
--
ALTER TABLE `patrimonio`
  ADD PRIMARY KEY (`cod_patrimonio`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`login_usuario`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
