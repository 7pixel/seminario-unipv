Sviluppare un "DeliveryService" che gestisce la consegna di pacchi acquistati da
un cliente.

Quando un cliente acquista un prodotto può scegliere che esso venga consegnato
in uno dei punti di ritiro disponibili.

Ci sono due tipi di punti di ritiro:
 - gli hub
 - i locker

Gli "hub" che possono accettare pacchi senza limiti di dimensione e senza limiti
di numero.

I "locker" che possono accettare un pacco solo se hanno a disposizione un box
libero abbastanza grande da contenerlo.

Scrivere un servizio che, data la dimensione del pacco:
 * restituisca l'elenco dei punti di ritiro disponibili.
 * consenta di prenotare uno dei suddetti punti, occupandolo

Note:

 * Ad ogni punto di ritiro è associato un nome in codice univoco
 * La dimensione del pacco è espressa un unico numero che rappresenta la misura
   del lato più lungo del pacco.
 * I box nei locker sono cubici e possono contenere solo pacchi con lato più
   lungo minore o uguale al lato del box.

Come si sviluppa usando i test:

 - si lavora in modo incrementale, un feature alla volta
 - si segue questo ritmo
    1. Quickly add a test.
    2. Make it compile.
    3. Watch it fail.
    4. Make it run.
    5. Make it right.

