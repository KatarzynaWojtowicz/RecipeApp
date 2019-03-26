
CREATE TABLE `category_component` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `category_recipe`
--

CREATE TABLE `category_recipe` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `component`
--

CREATE TABLE `component` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL,
  `id_recipe` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKp8isaaka1xb6r3a24ibl0kg7x` (`id_recipe`),
  KEY `FKiymqqp517nmqvubr9ye5rlrf1` (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


--
-- Table structure for table `hibernate_sequence`
--


CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


--
-- Table structure for table `recipe`
--

CREATE TABLE `recipe` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `id_role` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKh6xlomps6s4ejk728okd00ebp` (`id_role`),
  KEY `FKi5asomjyq5i0d5533ywa1syrs` (`id_user`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


--
-- Table structure for table `recipe_category_recipe`
--

CREATE TABLE `recipe_category_recipe` (
  `id_category` int(11) NOT NULL,
  `id_recipe` int(11) NOT NULL,
  PRIMARY KEY (`id_recipe`,`id_category`),
  KEY `FKmda2k81vmnce23262dsxn12os` (`id_category`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `recipe_component`
--

CREATE TABLE `recipe_component` (
  `id` int(11) NOT NULL,
  `amount` float DEFAULT NULL,
  `unit` varchar(255) DEFAULT NULL,
  `id_component` int(11) DEFAULT NULL,
  `id_recipe` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK8rgqdl276rnivdg27weqp8jva` (`id_component`),
  KEY `FKnkp5l7t9wfdy1e8c4tuqpat3x` (`id_recipe`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `recipe_step`
--

CREATE TABLE `recipe_step` (
  `id_step` int(11) NOT NULL,
  `id_recipe` int(11) NOT NULL,
  PRIMARY KEY (`id_recipe`,`id_step`),
  KEY `FKov2pt429y71da2yqnadyn9rh7` (`id_step`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `step`
--

CREATE TABLE `step` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `login` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `id_role` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6njoh3pti5jnlkowken3r8ttn` (`id_role`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


-- Dump completed on 2019-02-14 23:48:15
