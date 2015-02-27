#####Ohjelman rakennekuvaus

Ohjelmassa on Kissoja, joita säilötään Kissat luokan ylläpitämään listaan. PieniMuisti luokka tuntee sekä Kissa että Kissat 
luokat ja säilyttää ohjelman sisäistä pientä "tietokantaa" pienestä sukupuusta.

Sukukatolaskuri ei liity suoraan mihinkään muuhun perustoimintaluokkaan vain pelkästään HaeKissa ja TestiAstuta käyttöliittymä
luokkiin, sillä kissat annetaan JButton teksteinä eikä varsinaisina kissa-olioina.

Vari luokka on yhteydessä Kissaan ja Varikantajuuteen. PentujenVarit tuntee Varikantajuus sekä Kissa luokan. Varikantajuus ja
Kissa ovat myös yhteydessä.

Käyttöliittymän luokat tuntevat muut luokat paitsi Varin, joka ei ole niihin suorassa yhteydessä, ja PieniMuisti luokan, jota
käytetään vain pääluokassa pienen kissasetin tuottamiseksi.
