<?php
// Récupérez les données envoyées en utilisant les noms de paramètres spécifiés dans la requête POST
$param1 = $_POST['param1'] ?? null;

$dictionnaire = array("demba_bayil_feneu", "saboupoumaam", "nopil_amolowakh",
  "passer","dormir","calme","parle");

if ($param1 != null) {
  $motTrouve = false;

  for ($i = 0; $i < count($dictionnaire); $i++) {
    if ($dictionnaire[$i] == $param1) {
      $motTrouve = true;
      break;
    }
  }

  if ($motTrouve) {
    echo "C'est le bon mot.";
  } else {
    echo "On ne trouve pas le mot.";
  }
}
?>
