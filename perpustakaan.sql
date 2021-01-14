-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2021 at 03:14 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_buku`
--

CREATE TABLE `data_buku` (
  `ID` int(11) NOT NULL,
  `JudulBuku` varchar(50) NOT NULL,
  `GenreBuku` varchar(20) NOT NULL,
  `Penulis` varchar(30) NOT NULL,
  `Penerbit` varchar(20) NOT NULL,
  `Lokasi` varchar(10) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `data_buku`
--

INSERT INTO `data_buku` (`ID`, `JudulBuku`, `GenreBuku`, `Penulis`, `Penerbit`, `Lokasi`, `Stok`) VALUES
(3, 'Siap SNMPTN', 'Pendidikan', 'Gramedia', 'Gramedia', 'LT1.112', 15),
(4, 'Politik Negeri', 'Novel', 'Gramedia', 'Gramedia', 'LT2.573', 19),
(5, 'Laskar Pelangi', 'Novel', 'Sugeng', 'Buku Jalanan', 'LT3.678', 22),
(6, 'Teori Struktur Data', 'Pendidikan', 'Informatika', 'Informatika', 'LT1.289', 5),
(8, 'Jerapah Kejeduk', 'Dongeng', 'Imam Mur', 'Gramedia', 'LT3.886', 18);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_buku`
--
ALTER TABLE `data_buku`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_buku`
--
ALTER TABLE `data_buku`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
