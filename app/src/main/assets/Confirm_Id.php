<?php
   print '<form action="complete.php">';
   print   '<input type="hidden" name="name" value="'.$_GET['name'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['namekana'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['mail'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['phone'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['birthday'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['adress'].'">';
   print   '<input type="hidden" name="name" value="'.$_GET['comment'].'">';
   print   '<input type="submit" value="OK">';
   print '</form>';
?>