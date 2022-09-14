
CREATE TABLE `LOGS` (
                        `USER_ID` varchar(20) NOT NULL,
                        `DATED` varchar(100) NOT NULL,
                        `LOGGER` varchar(50) NOT NULL,
                        `LEVEL` varchar(10) NOT NULL,
                        `MESSAGE` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;