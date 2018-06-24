-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 24, 2018 at 11:46 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studenttransactiondb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `accountId` bigint(20) NOT NULL,
  `accountnumber` bigint(20) DEFAULT NULL,
  `studentId` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`accountId`, `accountnumber`, `studentId`) VALUES
(1, 41758365, 1),
(2, 50023767, 2),
(3, 6512615, 3),
(4, 34331666, 4),
(5, 3396935, 5),
(6, 45409779, 6);

-- --------------------------------------------------------

--
-- Table structure for table `budget`
--

CREATE TABLE `budget` (
  `budgetId` bigint(20) NOT NULL,
  `budget_ID` bigint(20) NOT NULL,
  `badgetCategoryId` bigint(20) NOT NULL,
  `budgetbalanceId` bigint(20) NOT NULL,
  `student_studentId` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `budget`
--

INSERT INTO `budget` (`budgetId`, `budget_ID`, `badgetCategoryId`, `budgetbalanceId`, `student_studentId`) VALUES
(1, 24687523, 1, 1, 1),
(2, 24291754, 1, 2, 2),
(3, 24212567, 1, 3, 3),
(4, 25046878, 1, 4, 4),
(5, 24632476, 1, 5, 5),
(6, 24014067, 1, 6, 6);

-- --------------------------------------------------------

--
-- Table structure for table `budgetbalance`
--

CREATE TABLE `budgetbalance` (
  `budgetbalanceId` bigint(20) NOT NULL,
  `balance` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `budgetbalance`
--

INSERT INTO `budgetbalance` (`budgetbalanceId`, `balance`) VALUES
(6, '1024.00'),
(3, '1142.36'),
(1, '2000.00'),
(5, '11255.80'),
(2, '11261.62'),
(4, '11865.00');

-- --------------------------------------------------------

--
-- Table structure for table `budgetcategory`
--

CREATE TABLE `budgetcategory` (
  `badgetCategoryId` bigint(20) NOT NULL,
  `budgetCategory` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `budgetcategory`
--

INSERT INTO `budgetcategory` (`badgetCategoryId`, `budgetCategory`) VALUES
(1, 'FOD\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `merchant`
--

CREATE TABLE `merchant` (
  `merchantId` bigint(20) NOT NULL,
  `merchant_ID` bigint(20) NOT NULL,
  `merchantname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `merchant`
--

INSERT INTO `merchant` (`merchantId`, `merchant_ID`, `merchantname`) VALUES
(1, 94754, 'Lucklin Catering\r\n'),
(2, 80345, 'Big Jims Grill Kingsway\r\n'),
(3, 11600, 'Yankys (Kingsway)\r\n'),
(4, 131765, 'pie Cafe & Smoothie Bar\r\n'),
(11, 14395, 'Ok Mini Mark Willows\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentId` bigint(20) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `studentnumber` bigint(20) NOT NULL,
  `surname` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentId`, `firstname`, `studentnumber`, `surname`) VALUES
(1, 'PAULUS\r\n', 20149949987, 'SEODISA'),
(2, 'LEBOHANG TLADINYANA\r\n', 21701071965, 'RAMPHENG\r\n'),
(3, 'KATLEHO KAVIN\r\n', 21504584987, 'MAFALELA\r\n'),
(4, 'MONICA\r\n', 21412292143, 'POLORI\r\n'),
(5, 'MONDE VINCENT\r\n', 21505574846, 'KOJANE\r\n'),
(6, 'MEGAN MASUMI CHARMAIN\r\n', 20157391164, 'KAMFER\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transactionId` bigint(20) NOT NULL,
  `TransactionDate` datetime NOT NULL,
  `transaction_ID` bigint(20) NOT NULL,
  `accountId` bigint(20) DEFAULT NULL,
  `budgetId` bigint(20) DEFAULT NULL,
  `budgetCategoryId` bigint(20) DEFAULT NULL,
  `budgetbalanceId` bigint(20) DEFAULT NULL,
  `merchantId` bigint(20) DEFAULT NULL,
  `studentId` bigint(20) DEFAULT NULL,
  `transactionTypeId` bigint(20) DEFAULT NULL,
  `transactionAmountId` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transactionId`, `TransactionDate`, `transaction_ID`, `accountId`, `budgetId`, `budgetCategoryId`, `budgetbalanceId`, `merchantId`, `studentId`, `transactionTypeId`, `transactionAmountId`) VALUES
(1, '2017-03-01 00:45:51', 916010862, 1, 1, 1, 1, 1, 1, 1, 1),
(2, '2017-03-24 06:32:59', 916012379, 1, 1, 1, 1, 1, 1, 1, 2),
(3, '2017-03-01 07:07:14', 916012380, 1, 1, 1, 1, 2, 1, 1, 3),
(4, '2017-03-01 07:11:37', 916012381, 1, 1, 1, 1, 3, 1, 1, 4),
(5, '2017-03-01 07:13:18', 916012382, 1, 1, 1, 1, 3, 1, 1, 5),
(6, '2017-03-01 07:15:38', 916012383, 1, 1, 1, 1, 4, 1, 1, 6),
(7, '2017-03-01 07:17:06', 916012384, 1, 1, 1, 1, 11, 1, 1, 7),
(8, '2017-03-01 07:21:31', 916012385, 2, 2, 1, 2, 11, 2, 1, 8),
(9, '2017-03-01 07:23:29', 916012386, 2, 2, 1, 2, 4, 2, 1, 9),
(10, '2017-03-01 07:24:02', 916012387, 2, 2, 1, 2, 2, 2, 1, 10),
(15, '2017-03-01 07:25:38', 916012388, 3, 3, 1, 3, 2, 3, 1, 13),
(16, '2017-03-01 07:27:11', 916012389, 4, 4, 1, 4, 1, 4, 1, 5),
(17, '2017-03-01 07:28:16', 916012390, 5, 5, 1, 5, 1, 5, 1, 14),
(18, '2017-03-01 07:28:19', 916012391, 6, 6, 1, 6, 1, 6, 1, 15);

-- --------------------------------------------------------

--
-- Table structure for table `transactionamount`
--

CREATE TABLE `transactionamount` (
  `transactionAmountId` bigint(20) NOT NULL,
  `transactionAmount` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactionamount`
--

INSERT INTO `transactionamount` (`transactionAmountId`, `transactionAmount`) VALUES
(14, '8.00'),
(9, '12.50'),
(2, '18.50'),
(5, '22.50'),
(6, '29.00'),
(4, '32.50'),
(15, '33.00'),
(7, '37.97'),
(3, '39.50'),
(10, '56.50'),
(13, '58.50'),
(8, '79.60'),
(1, '2500.00');

-- --------------------------------------------------------

--
-- Table structure for table `transactiontype`
--

CREATE TABLE `transactiontype` (
  `transactionTypeId` bigint(20) NOT NULL,
  `transactionType` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transactiontype`
--

INSERT INTO `transactiontype` (`transactionTypeId`, `transactionType`) VALUES
(1, 'PUR\r\n');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`accountId`),
  ADD UNIQUE KEY `accountId` (`accountId`),
  ADD UNIQUE KEY `accountnumber` (`accountnumber`),
  ADD KEY `FK1D0C220D92F803B7` (`studentId`);

--
-- Indexes for table `budget`
--
ALTER TABLE `budget`
  ADD PRIMARY KEY (`budgetId`),
  ADD UNIQUE KEY `budgetId` (`budgetId`),
  ADD UNIQUE KEY `budget_ID` (`budget_ID`),
  ADD UNIQUE KEY `budgetbalanceId` (`budgetbalanceId`),
  ADD KEY `FK773F9B65D83232B3` (`student_studentId`),
  ADD KEY `FK773F9B65FFCB4A47` (`badgetCategoryId`),
  ADD KEY `FK773F9B651526ABAF` (`budgetbalanceId`);

--
-- Indexes for table `budgetbalance`
--
ALTER TABLE `budgetbalance`
  ADD PRIMARY KEY (`budgetbalanceId`),
  ADD UNIQUE KEY `budgetbalanceId` (`budgetbalanceId`),
  ADD UNIQUE KEY `balance` (`balance`);

--
-- Indexes for table `budgetcategory`
--
ALTER TABLE `budgetcategory`
  ADD PRIMARY KEY (`badgetCategoryId`),
  ADD UNIQUE KEY `badgetCategoryId` (`badgetCategoryId`),
  ADD UNIQUE KEY `budgetCategory` (`budgetCategory`);

--
-- Indexes for table `merchant`
--
ALTER TABLE `merchant`
  ADD PRIMARY KEY (`merchantId`),
  ADD UNIQUE KEY `merchantId` (`merchantId`),
  ADD UNIQUE KEY `merchant_ID` (`merchant_ID`),
  ADD UNIQUE KEY `merchantname` (`merchantname`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentId`),
  ADD UNIQUE KEY `studentId` (`studentId`),
  ADD UNIQUE KEY `studentnumber` (`studentnumber`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`transactionId`),
  ADD UNIQUE KEY `transactionId` (`transactionId`),
  ADD UNIQUE KEY `transaction_ID` (`transaction_ID`),
  ADD KEY `FK7FA0D2DE92F803B7` (`studentId`),
  ADD KEY `FK7FA0D2DEC57FDF1B` (`accountId`),
  ADD KEY `FK7FA0D2DEA834F051` (`transactionTypeId`),
  ADD KEY `FK7FA0D2DE6C385685` (`merchantId`),
  ADD KEY `FK7FA0D2DE4EF975B` (`budgetCategoryId`),
  ADD KEY `FK7FA0D2DE95BAE4BF` (`budgetId`),
  ADD KEY `FK7FA0D2DE1526ABAF` (`budgetbalanceId`),
  ADD KEY `FK7FA0D2DE1C52DA8D` (`transactionAmountId`);

--
-- Indexes for table `transactionamount`
--
ALTER TABLE `transactionamount`
  ADD PRIMARY KEY (`transactionAmountId`),
  ADD UNIQUE KEY `transactionAmountId` (`transactionAmountId`),
  ADD UNIQUE KEY `transactionAmount` (`transactionAmount`);

--
-- Indexes for table `transactiontype`
--
ALTER TABLE `transactiontype`
  ADD PRIMARY KEY (`transactionTypeId`),
  ADD UNIQUE KEY `transactionTypeId` (`transactionTypeId`),
  ADD UNIQUE KEY `transactionType` (`transactionType`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `accountId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `budget`
--
ALTER TABLE `budget`
  MODIFY `budgetId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `budgetbalance`
--
ALTER TABLE `budgetbalance`
  MODIFY `budgetbalanceId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `budgetcategory`
--
ALTER TABLE `budgetcategory`
  MODIFY `badgetCategoryId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `merchant`
--
ALTER TABLE `merchant`
  MODIFY `merchantId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `studentId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `transaction`
--
ALTER TABLE `transaction`
  MODIFY `transactionId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `transactionamount`
--
ALTER TABLE `transactionamount`
  MODIFY `transactionAmountId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `transactiontype`
--
ALTER TABLE `transactiontype`
  MODIFY `transactionTypeId` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `account`
--
ALTER TABLE `account`
  ADD CONSTRAINT `FK1D0C220D92F803B7` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`);

--
-- Constraints for table `budget`
--
ALTER TABLE `budget`
  ADD CONSTRAINT `FK773F9B651526ABAF` FOREIGN KEY (`budgetbalanceId`) REFERENCES `budgetbalance` (`budgetbalanceId`),
  ADD CONSTRAINT `FK773F9B65D83232B3` FOREIGN KEY (`student_studentId`) REFERENCES `student` (`studentId`),
  ADD CONSTRAINT `FK773F9B65FFCB4A47` FOREIGN KEY (`badgetCategoryId`) REFERENCES `budgetcategory` (`badgetCategoryId`);

--
-- Constraints for table `transaction`
--
ALTER TABLE `transaction`
  ADD CONSTRAINT `FK7FA0D2DE1526ABAF` FOREIGN KEY (`budgetbalanceId`) REFERENCES `budgetbalance` (`budgetbalanceId`),
  ADD CONSTRAINT `FK7FA0D2DE1C52DA8D` FOREIGN KEY (`transactionAmountId`) REFERENCES `transactionamount` (`transactionAmountId`),
  ADD CONSTRAINT `FK7FA0D2DE4EF975B` FOREIGN KEY (`budgetCategoryId`) REFERENCES `budgetcategory` (`badgetCategoryId`),
  ADD CONSTRAINT `FK7FA0D2DE6C385685` FOREIGN KEY (`merchantId`) REFERENCES `merchant` (`merchantId`),
  ADD CONSTRAINT `FK7FA0D2DE92F803B7` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`),
  ADD CONSTRAINT `FK7FA0D2DE95BAE4BF` FOREIGN KEY (`budgetId`) REFERENCES `budget` (`budgetId`),
  ADD CONSTRAINT `FK7FA0D2DEA834F051` FOREIGN KEY (`transactionTypeId`) REFERENCES `transactiontype` (`transactionTypeId`),
  ADD CONSTRAINT `FK7FA0D2DEC57FDF1B` FOREIGN KEY (`accountId`) REFERENCES `account` (`accountId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
