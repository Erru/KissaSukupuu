#####Kissan sukupuun haku:
Kirjoita Hae kissa nimellä napin alapuolella olevaan tekstikentään "nimi" tekstin tilalle haettavan kissan nimi. Mikäli kissaa
pyydetyllä nimellä ei ole olemassa, ohjelma ilmoittaa siitä ja pyytää lisäämään kissan tai tarkistamaan nimen kirjoitusasun.
Erikokoisilla kirjaimilla on väliä. Paina lopuksi 'Hae kissa nimellä' nappia.

#####Lisää kissa:
Kissoja lisätään vain ohjelman hetkelliseen muistiin. Kissaa lisätessä ainoa pakollinen tieto on kissan nimi, mutta kerralla
voidaan myös lisätä kissan vanhemmat, rotu(FIFen rotulyhenteillä kuten EUR), väri (FIFen ems muodossa kuten a 22) ja sukupuoli
(muodossa F tai M). Ohjelma ei valita vääränlaisesta syötteestä rotu, väri tai sukupuolikohdassa ja sukupuoli ja rotu ovat
käyttäjän iloksi. Mikäli väri on ilmaistu muuten, se voi vaikuttaa värikantajuuksien määrittämiseen ja tuloksiin tulla virheitä.
Kissaa luodessa nimen lisäksi voidaan myös ilmoittaa vain osa tiedoista. Paina lopuksi 'Lisää uusi kissa' nappia.

#####Lisää tietoja kissalle:
Olemassa olevalle kissalle voi lisätä täydentäviä tietoja tai vaihtaa tietoja tiedon lisäys ominaisuuden kautta, jos jotain on
tullut laitettua väärin. Tähän vaaditaan kissan nimi ja vähintään yksi lisättävä tieto, kaikki tiedot saa lisätä/vaihtaa kerralla.
Mikäli kissaa, jolle tietoja yritetään lisätä, ei ole olemassa, siitä ilmoitetaan nimi tekstikentässä. Paina lopuksi 'Lisää 
tietoja kissalle' nappia.

######Esimerkki millaisia tietoja kissalle annetaan:
Nimi: Errun kissanpentu

Isän nimi: Katti Matikainen

Emon nimi: Kaunis Kattimus

rotu: EUR

väri: f 24

sukupuoli: F

#####Testiastutus:
Ohjelman pääideana on testiastutusten tekeminen ohjelman muistissa oleville kissoille. Testiastutus näyttää pentujen mahdollisen
sukutaulun, sukukatokertoimen ja minkä värisiä pentuja voi yhdistelmästä tulla varmasti (mitä voidaan päätellä pentujen vanhempien
ja isovanhempien värien perusteella). Testiastuttaaksesi kissat kirjoita tekstikenttiin emo ja isa tekstien tilalle kissojen nimet,
jotka halutaan testiastuttaa. Huolehdi, että ne ovat eri sukupuolta, sillä ohjelma ei tarkista sitä (sillä sukupuoli ei ole 
pakollinen tieto. Paina 'Testiastuta kissat' nappia. Mikäli kummatkin kissat ovat ohjelman muistissa, ne testiastutetaan, muuten
ohjelma varoittaa puuttuvasta tai puuttuvista kissoista. Ennustetut pentujen värit ovat eivät kata kaikkia värejä, joten ennustukset
ovat nyt suuntaa antavia.
