-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- 主機： 127.0.0.1
-- 產生時間： 2023-07-09 17:17:50
-- 伺服器版本： 10.4.27-MariaDB
-- PHP 版本： 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `暑假研習`
--

-- --------------------------------------------------------

--
-- 資料表結構 `帳密表`
--

CREATE TABLE `帳密表` (
  `帳號` varchar(10) NOT NULL,
  `密碼` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- 傾印資料表的資料 `帳密表`
--

INSERT INTO `帳密表` (`帳號`, `密碼`) VALUES
('kbsora', 'sora0127'),
('soto1456', '1234sss');

-- --------------------------------------------------------

--
-- 資料表結構 `暑假技術研習`
--

CREATE TABLE `暑假技術研習` (
  `姓氏` varchar(10) NOT NULL,
  `名字` varchar(10) NOT NULL,
  `出生日期` date NOT NULL,
  `想說的話` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- 傾印資料表的資料 `暑假技術研習`
--

INSERT INTO `暑假技術研習` (`姓氏`, `名字`, `出生日期`, `想說的話`) VALUES
('林', '靖翔', '2003-01-27', 'aaaaaaaaaaaaaaaaaaaaaaaaa'),
('溫', '敏淦', '1991-02-07', 'uuuuuuuuuuuuuuuuuuuuuuuu'),
('kbsora', '', '0000-00-00', '');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `帳密表`
--
ALTER TABLE `帳密表`
  ADD PRIMARY KEY (`帳號`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
