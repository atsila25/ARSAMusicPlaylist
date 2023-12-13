-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2023 at 06:29 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `playlist`
--

-- --------------------------------------------------------

--
-- Table structure for table `musik`
--

CREATE TABLE `musik` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `artis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `musik`
--

INSERT INTO `musik` (`id`, `judul`, `artis`) VALUES
(1, 'Stairway to Heaven', 'Led Zeppelin'),
(2, 'Let It Be', 'The Beatles'),
(3, 'Wonderwall', 'Oasis'),
(4, 'Yesterday', 'The Beatles'),
(5, 'Hotel California', 'Eagles'),
(6, 'Smells Like Teen Spirit', 'Nirvana'),
(7, 'Hey Jude', 'The Beatles'),
(8, 'Imagine', 'John Lennon'),
(9, 'Shape of My Heart', 'Sting'),
(10, 'Black Dog', 'Led Zeppelin'),
(11, 'Bohemian Rhapsody', 'Queen'),
(12, 'Thriller', 'Michael Jackson'),
(13, 'Another Brick in the Wall', 'Pink Floyd'),
(14, 'I Want to Hold Your Hand', 'The Beatles'),
(15, 'Highway to Hell', 'AC/DC'),
(16, 'Billie Jean', 'Michael Jackson'),
(17, 'Like a Rolling Stone', 'Bob Dylan'),
(18, 'Sweet Child o\' Mine', 'Guns N\' Roses'),
(19, 'Smells Like Teen Spirit', 'Nirvana'),
(20, 'Born to Run', 'Bruce Springsteen');

-- --------------------------------------------------------

--
-- Table structure for table `nama_tabel`
--

CREATE TABLE `nama_tabel` (
  `id` int(11) NOT NULL,
  `judul` varchar(255) DEFAULT NULL,
  `artis` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nama_tabel`
--

INSERT INTO `nama_tabel` (`id`, `judul`, `artis`) VALUES
(1, 'Stairway to Heaven', 'Led Zeppelin'),
(2, 'Let It Be', 'The Beatles'),
(3, 'Wonderwall', 'Oasis'),
(4, 'Yesterday', 'The Beatles'),
(5, 'Hotel California', 'Eagles'),
(6, 'Smells Like Teen Spirit', 'Nirvana'),
(7, 'Hey Jude', 'The Beatles'),
(8, 'Imagine', 'John Lennon'),
(9, 'Shape of My Heart', 'Sting'),
(10, 'Black Dog', 'Led Zeppelin'),
(11, 'Bohemian Rhapsody', 'Queen'),
(12, 'Thriller', 'Michael Jackson'),
(13, 'Another Brick in the Wall', 'Pink Floyd'),
(14, 'I Want to Hold Your Hand', 'The Beatles'),
(15, 'Highway to Hell', 'AC/DC'),
(16, 'Billie Jean', 'Michael Jackson'),
(17, 'Like a Rolling Stone', 'Bob Dylan'),
(18, 'Sweet Child o\' Mine', 'Guns N\' Roses'),
(19, 'Smells Like Teen Spirit', 'Nirvana'),
(20, 'Born to Run', 'Bruce Springsteen');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `musik`
--
ALTER TABLE `musik`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `nama_tabel`
--
ALTER TABLE `nama_tabel`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `musik`
--
ALTER TABLE `musik`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `nama_tabel`
--
ALTER TABLE `nama_tabel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
