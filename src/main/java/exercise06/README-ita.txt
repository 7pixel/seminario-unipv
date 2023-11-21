======================================
Gilded Rose - Specifica dei requisiti
======================================

Salve e benvenuti nel team Gilded Rose. Come sapete, siamo una piccola locanda con una posizione privilegiata in una città importante, gestita da una simpatica locandiera di nome Allison. Compriamo e vendiamo solo le merci migliori.
Sfortunatamente, la qualità dei nostri prodotti si deteriora costantemente man mano che si avvicinano alla data di scadenza. Abbiamo un sistema che aggiorna l'inventario per noi. È stato sviluppato da un tipo spigliato di nome Leeroy, che è passato a nuove avventure. Il vostro compito è quello di aggiungere una nuova funzione al nostro sistema, in modo che sia possibile iniziare a vendere una nuova categoria di articoli. Prima di tutto, un'introduzione al nostro sistema:

	- Tutti gli oggetti hanno un valore SellIn che indica il numero di giorni che abbiamo a disposizione per vendere l'oggetto.
	- Tutti gli oggetti hanno un valore di Qualità che indica il valore dell'oggetto.
	- Alla fine di ogni giornata, il nostro sistema abbassa entrambi i valori per ogni articolo.

Piuttosto semplice, no? Ma è qui che il discorso si fa interessante:

	- Una volta superata la data di scadenza, la qualità si degrada due volte più velocemente.
	- La qualità di un articolo non è mai negativa
	- Il "Brie invecchiato (Aged Brie)" aumenta di fatto la sua qualità quanto più invecchia
	- La qualità di un prodotto non è mai superiore al 50%.
	- Il "Sulfuras", essendo un oggetto leggendario, non deve mai essere venduto e non diminuisce di qualità.
	- I "pass per il backstage", come il brie invecchiato, aumentano di qualità man mano che il loro valore di SellIn si avvicina;
	- La qualità aumenta di 2 quando ci sono 10 giorni o meno e di 3 quando ci sono 5 giorni o meno, ma la qualità scende a 0 dopo il concerto.

Di recente abbiamo ingaggiato un fornitore di oggetti evocati. Questo richiede un aggiornamento del nostro sistema:
	- Gli oggetti "evocati" degradano la qualità due volte più velocemente degli oggetti normali.

Sentitevi liberi di apportare qualsiasi modifica al metodo UpdateQuality e di aggiungere nuovo codice, purché tutto funzioni correttamente. Tuttavia, non modificate la classe "Item" o la proprietà "Items", perché appartengono al goblin nell'angolo, che si arrabbierà e vi sparerà, perché non crede nella condivisione del codice (se volete, potete rendere statici il metodo UpdateQuality e la proprietà Items, ci pensiamo noi a coprirvi le spalle).

Per chiarire, un oggetto non può mai avere un aumento di Qualità superiore a 50, ma "Sulfuras" è un oggetto leggendario e quindi la sua Qualità è leggendaria e come tale la sua Qualità è 80 e non si altera mai.

Fortunatamente in Università i Paladini del codice vi hanno raccontato dell'epica tradizione del Testing. Prima di lanciarvi all'avventura implementando la nuova funzionalità, quindi, vi dovrete assicurare di non compromettere il comportamento attuale del sistema. Altrimenti non vedrete i dobloni d'oro che vi sono stati promessi.

Suggerimenti:
 - Sfruttate le indicazioni fornite nella traccia per definire i vostri test (ogni caso d'uso corrisponde a uno o più test da scrivere).
 - Per chi usa Eclipse: è possibile sfruttare il Coverage per capire quali punti del codice sono già stati raggiunti e quindi testati. L'ideale è raggiungere il 100% di Coverage.
 - Per chi usa NetBeans: il vostro equipaggiamento purtroppo è difettoso e non avete a disposizione il Coverage. Dalla vostra parte avete pazienza e perseveranza. Per sapere se i vostri test raggiungono un determinato pezzo di codice potete:
   - commentare temporaneamente quel codice
   - lanciare i vostri test
   - se è tutto verde vuol dire che nessuno dei vostri test faceva uso di quel codice e dovrete quindi aggiungere un nuovo test
   - se qualcosa si rompe vuol dire che i vostri test raggiungono quel codice
   