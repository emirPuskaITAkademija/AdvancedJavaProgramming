
--
-- Database: `movies`
--

-- --------------------------------------------------------

--
-- Table structure for table `people`
--

DROP TABLE IF EXISTS `people`;
CREATE TABLE `people` (
  `person_id` int(10) UNSIGNED NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `account_type` tinyint(1) UNSIGNED NOT NULL DEFAULT '1',
  `dob` year(4) NOT NULL DEFAULT '2000',
  `compress_pass` varbinary(50) NOT NULL,
  `hash_pass` varchar(128) NOT NULL,
  `enc_pass` varbinary(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `people`
--

INSERT INTO `people` (`person_id`, `first_name`, `last_name`, `account_type`, `dob`, `compress_pass`, `hash_pass`, `enc_pass`) VALUES
(10000, 'Henry', 'Smith', 1, 2000, '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `people`
--
ALTER TABLE `people`
  ADD PRIMARY KEY (`person_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `people`
--
ALTER TABLE `people`
  MODIFY `person_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10001;
