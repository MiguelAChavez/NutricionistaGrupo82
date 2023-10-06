-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:37:59
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `nutricionista`
--
CREATE DATABASE IF NOT EXISTS `nutricionista` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `nutricionista`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comida`
--

CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `detalle` text NOT NULL,
  `cantidadCalorias` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `fechaFinal` date NOT NULL,
  `pesoBuscado` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

CREATE TABLE `dietacomida` (
  `idDietaComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(20) NOT NULL,
  `porcion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

CREATE TABLE `historial` (
  `idHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fechaRegistro` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `domicilio` varchar(80) NOT NULL,
  `fechaNac` date NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT 1,
  `pesoActual` double NOT NULL,
  `altura` double NOT NULL,
  `pesoDeseado` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `fechaNac`, `sexo`, `estado`, `pesoActual`, `altura`, `pesoDeseado`) VALUES
(21, 'Juan', 'Perez', 12345678, '555-123-4567', 'Calle 123', '1990-05-15', 'Masculino', 1, 75.5, 175, 70),
(22, 'Maria', 'Gomez', 23456789, '555-234-5678', 'Avenida 456', '1985-09-20', 'Femenino', 1, 85, 160, 60),
(23, 'Carlos', 'Lopez', 34567890, '555-345-6789', 'Plaza 789', '1995-02-10', 'Masculino', 1, 70, 180, 75),
(24, 'Ana', 'Rodriguez', 45678901, '555-456-7890', 'Calle 567', '1988-11-30', 'Femenino', 1, 50, 155, 55),
(25, 'Luis', 'Fernandez', 56789012, '555-567-8901', 'Avenida 890', '1992-07-25', 'Masculino', 0, 80, 170, 72),
(26, 'Laura', 'Martinez', 67890123, '555-678-9012', 'Calle 1011', '1980-04-03', 'Femenino', 0, 90, 165, 70),
(27, 'Pedro', 'Gonzalez', 78901234, '555-789-0123', 'Plaza 1213', '1998-12-18', 'Masculino', 1, 78, 175, 73),
(28, 'Isabel', 'Lopez', 89012345, '555-890-1234', 'Avenida 1415', '1987-03-12', 'Femenino', 1, 88.5, 160, 65),
(29, 'Miguel', 'Torres', 90123456, '555-901-2345', 'Calle 1617', '1993-08-08', 'Masculino', 1, 76, 178, 74),
(30, 'Juana', 'Sanchez', 1234567, '555-012-2136', 'Avenida 1819', '1982-06-01', 'femenino', 0, 82, 163, 68),
(31, 'Pedro', 'Peres', 20972164, '21-1232-42', 'Gral. Paz 550', '2023-10-04', 'Masculino', 0, 300, 1.8, 150),
(35, 'Maria', 'Rosales', 213123, '123123', 'Cap.', '1990-09-11', 'Femenino', 1, 90, 1.65, 60);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `comida`
--
ALTER TABLE `comida`
  ADD PRIMARY KEY (`idComida`),
  ADD UNIQUE KEY `nombre` (`nombre`);

--
-- Indices de la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD PRIMARY KEY (`idDieta`),
  ADD UNIQUE KEY `nombre` (`nombre`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD PRIMARY KEY (`idDietaComida`),
  ADD KEY `idComida` (`idComida`),
  ADD KEY `idDieta` (`idDieta`);

--
-- Indices de la tabla `historial`
--
ALTER TABLE `historial`
  ADD PRIMARY KEY (`idHistorial`),
  ADD KEY `idPaciente` (`idPaciente`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`idPaciente`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `comida`
--
ALTER TABLE `comida`
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=38;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `dieta`
--
ALTER TABLE `dieta`
  ADD CONSTRAINT `dieta_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

--
-- Filtros para la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  ADD CONSTRAINT `dietacomida_ibfk_1` FOREIGN KEY (`idComida`) REFERENCES `comida` (`idComida`),
  ADD CONSTRAINT `dietacomida_ibfk_2` FOREIGN KEY (`idDieta`) REFERENCES `dieta` (`idDieta`);

--
-- Filtros para la tabla `historial`
--
ALTER TABLE `historial`
  ADD CONSTRAINT `historial_ibfk_1` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
