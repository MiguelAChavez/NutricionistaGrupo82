-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 22:14:18
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

DROP TABLE IF EXISTS `comida`;
CREATE TABLE `comida` (
  `idComida` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `detalle` text NOT NULL,
  `cantidadCalorias` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comida`
--

INSERT INTO `comida` (`idComida`, `nombre`, `detalle`, `cantidadCalorias`, `estado`) VALUES
(1, 'milanesa', 'Milanesa de pollo.', 300, 1),
(2, 'Ravioles de ricota', 'plato de ravioles con salsa cuatro quesos que se yo.', 200, 1),
(3, 'Lasaña', 'Una porcion de lasaña de berenjenas.', 260, 1),
(4, 'Filet de merluza', 'Filet de merluza frito.', 240, 1),
(5, 'Calamaretis a la lionesa', 'Plato con cebolla.', 80, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dieta`
--

DROP TABLE IF EXISTS `dieta`;
CREATE TABLE `dieta` (
  `idDieta` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `fechaInicial` date NOT NULL,
  `pesoInicial` double NOT NULL,
  `fechaFinal` date NOT NULL,
  `pesoFinal` double NOT NULL DEFAULT 0,
  `estado` tinyint(1) NOT NULL DEFAULT 1,
  `esExitosa` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dieta`
--

INSERT INTO `dieta` (`idDieta`, `idPaciente`, `nombre`, `fechaInicial`, `pesoInicial`, `fechaFinal`, `pesoFinal`, `estado`, `esExitosa`) VALUES
(1, 23, 'Dieta de carlos', '2022-10-26', 150, '2023-10-22', 75, 0, 1),
(3, 22, 'Dieta', '2023-10-25', 85, '2023-10-28', 85, 0, 0),
(4, 24, 'Dieta de Ana', '2023-10-27', 50, '2023-11-10', 50, 1, 0),
(6, 27, 'dieta de pedro', '2023-10-26', 80, '2023-11-06', 71, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `dietacomida`
--

DROP TABLE IF EXISTS `dietacomida`;
CREATE TABLE `dietacomida` (
  `idDietaComida` int(11) NOT NULL,
  `idComida` int(11) NOT NULL,
  `idDieta` int(11) NOT NULL,
  `horario` varchar(20) NOT NULL,
  `porcion` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `dietacomida`
--

INSERT INTO `dietacomida` (`idDietaComida`, `idComida`, `idDieta`, `horario`, `porcion`) VALUES
(14, 3, 1, 'Desayuno', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial`
--

DROP TABLE IF EXISTS `historial`;
CREATE TABLE `historial` (
  `idHistorial` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `peso` double NOT NULL,
  `fechaRegistro` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial`
--

INSERT INTO `historial` (`idHistorial`, `idPaciente`, `peso`, `fechaRegistro`) VALUES
(1, 23, 72, '2022-10-12'),
(2, 23, 70.5, '2023-02-09'),
(3, 23, 75, '2023-10-16'),
(4, 21, 75, '2023-10-17'),
(5, 28, 83.5, '2023-10-17'),
(6, 23, 73, '2023-10-17'),
(7, 21, 79, '2023-10-17'),
(8, 27, 80, '2023-10-25'),
(9, 44, 73, '2023-10-27'),
(10, 45, 80, '2023-10-27'),
(11, 45, 79, '2023-10-27');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

DROP TABLE IF EXISTS `paciente`;
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
  `pesoBuscado` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`idPaciente`, `nombre`, `apellido`, `dni`, `telefono`, `domicilio`, `fechaNac`, `sexo`, `estado`, `pesoActual`, `altura`, `pesoBuscado`) VALUES
(21, 'Juan', 'Perez', 12345678, '555434567', 'Calle 123', '1990-05-15', 'Masculino', 1, 79, 175, 70),
(22, 'Maria', 'Gomez', 23456789, '555-234-5678', 'Avenida 456', '1985-09-20', 'Femenino', 1, 85, 160, 60),
(23, 'Carlos', 'Lopez', 34567890, '555346789', 'Plaza 789', '1995-02-10', 'Masculino', 1, 75, 180, 75),
(24, 'Ana', 'Rodriguez', 45678901, '555-456-7890', 'Calle 567', '1988-11-30', 'Femenino', 1, 50, 155, 55),
(25, 'Luis', 'Fernandez', 56789012, '555-567-8901', 'Avenida 890', '1992-07-25', 'Masculino', 0, 80, 170, 72),
(26, 'Laura', 'Martinez', 67890123, '555-678-9012', 'Calle 1011', '1980-04-03', 'Femenino', 0, 90, 165, 70),
(27, 'Pedro', 'Gonzalez', 78901234, '555540123', 'Plaza 1213', '1998-12-18', 'Masculino', 1, 71, 175, 73),
(28, 'carmen', 'Lopez', 89012345, '555890234', 'Avenida 1415', '1987-03-12', 'Femenino', 0, 83.5, 160, 65),
(29, 'Miguel', 'Torres', 90123456, '555-901-2345', 'Calle 1617', '1993-08-08', 'Masculino', 1, 76, 178, 74),
(30, 'Juana', 'Sanchez', 1234567, '222113243', 'Avenida 1819', '1982-06-01', 'Femenino', 0, 82, 163, 68),
(31, 'Pedro', 'Peres', 20972164, '21-1232-42', 'Gral. Paz 550', '2023-10-04', 'Masculino', 0, 300, 180, 150),
(35, 'Maria', 'Rosales', 213123, '123123', 'Cap.', '1990-09-11', 'Femenino', 1, 90, 165, 60),
(38, 'Pedro', 'Perez', 25879962, '1232432', 'Capital Federal Directorio 4700', '2019-10-03', 'Masculino', 1, 180, 180, 90),
(41, 'dsasda', 'sad', 243423, '123456', 'sadsda', '2023-10-06', 'Femenino', 1, 23, 154, 21),
(42, 'dfds', 'dsfsd', 12312321, '123456123123', 'sdsa', '2023-10-07', 'Femenino', 1, 23, 154, 21),
(43, 'Fede', 'ism', 44312332, '123456789', 'calle falsa 4332', '2000-08-16', 'Femenino', 1, 67, 176, 75),
(44, 'Julieta', 'Diaz', 324454544, '23545434', 'cll. falsa 223', '1990-05-09', 'Masculino', 1, 73, 169, 67),
(45, 'Marcos', 'Shoow', 23312323, '2323412', 'dda. sad', '1990-08-16', 'Femenino', 1, 79, 186, 78);

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
  MODIFY `idComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `dieta`
--
ALTER TABLE `dieta`
  MODIFY `idDieta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `dietacomida`
--
ALTER TABLE `dietacomida`
  MODIFY `idDietaComida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `historial`
--
ALTER TABLE `historial`
  MODIFY `idHistorial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `paciente`
--
ALTER TABLE `paciente`
  MODIFY `idPaciente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

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
