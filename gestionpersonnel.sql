-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Client :  127.0.0.1
-- Généré le :  Lun 08 Mars 2021 à 16:56
-- Version du serveur :  5.7.14
-- Version de PHP :  5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionpersonnel`
--

-- --------------------------------------------------------

--
-- Structure de la table `personne`
--

CREATE TABLE `personne` (
  `Identifiant` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `profession` varchar(30) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `promotion` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `personne`
--

INSERT INTO `personne` (`Identifiant`, `nom`, `prenom`, `profession`, `sexe`, `promotion`) VALUES
(1, 'kongo', 'herve', 'celibataire', 'masculin', 'premiere licence'),
(2, 'kongo', 'herve', 'celibataire', 'masculin', 'premiere licence'),
(3, 'masambukidi', 'spark', 'celibataire', 'masculin', 'premiere licence'),
(4, 'kongo', 'herve', 'celibataire', 'masculin', 'premiere licence'),
(5, 'kongo', 'herve', 'celibataire', 'masculin', 'premiere licence'),
(6, 'kongo', 'herve', 'celibataire', 'masculin', 'premiere licence');

-- --------------------------------------------------------

--
-- Structure de la table `personnes`
--

CREATE TABLE `personnes` (
  `Identifiant` int(11) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `profession` varchar(20) NOT NULL,
  `sexe` varchar(10) NOT NULL,
  `promotion` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `personne`
--
ALTER TABLE `personne`
  ADD PRIMARY KEY (`Identifiant`);

--
-- Index pour la table `personnes`
--
ALTER TABLE `personnes`
  ADD PRIMARY KEY (`Identifiant`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `personne`
--
ALTER TABLE `personne`
  MODIFY `Identifiant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `personnes`
--
ALTER TABLE `personnes`
  MODIFY `Identifiant` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
