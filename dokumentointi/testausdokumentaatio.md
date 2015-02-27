#####Testausdokumentaatio

Testasin käsin käyttöliittymän ominaisuudet, kuten onnistuuko juuri lisätyn kissan hakeminen ja päivittyvätkö lisätyt tiedot
kissalle. Myös testiastutuksen toiminnallisuus on testattu käsin. Loin ohjelmaan pienen puutteellisen sukupuun testauksen avuksi
ja lisäilin myös kissoja avauskerroilla tarvittaessa. Käytin vajaavaista sukutaulua, koska usein sukutaulut voivat olla puutteellisia
kuten oman rotuni noviisien takia, jolloin ohjelma ei saa kaatua, jos sukutaulusta puuttuu kissoja. Samoin minun piti korjata
värikantajuuden määrittäminen niin, että sen voi tehdä myös ilman kissan vanhempia.

En ole rajannut lisättäviä värejä tiettyyn tyyliin tai pituuteen, sillä kissaroduissa on suurta vaihtelua ja erilaisia kirjain +
numero yhdistelmiä, joten vaihtoehtojen rajaaminen ei ole kannattavaa, kun ohjelman väritoiminnallisuus ei ole täysin kattava
kaikille väreille ja roduille. Kaikilla roduilla ei siis edes sallita kaikkia värejä, joten rajoitteet pitää tehdä hyvin 
yksityiskohtaisesti, jos niitä tekee. Tämä mahdollisuus syöttää vääränlainen väri voi aiheuttaa värien ennustuksissa virheitä.
Esim. Sininen sisältää n kirjaimen, jolloin se voidaan tulkitaan mustaksi. Ohjelmassa ei myöskään ole kovin montaa väriä mukana,
koska en rehellisesti ehtinyt lisämään kaikkia (pelkästään omassa rodussani on sallittu n. 70 erilaista pohjaväri + kuvio/kuviottomuus 
yhdistelmää). Mm. PieniMuisti luokassa luotu Nuttu kissa ei voi saada mustia tai sinisiä jälkeläisiä, mutta ohjelma ei tiedä sitä, 
koska punaisen värin kummallisuuksia (X-kromosomaalisesti periytyvä) ei ole sille kerrottu.

Lisäksi sukukatokerroin käyttäytyy kummallisesti ohjelman aikana luotujen kissojen kanssa ainakin, jos niillä ei ole vanhempia.
