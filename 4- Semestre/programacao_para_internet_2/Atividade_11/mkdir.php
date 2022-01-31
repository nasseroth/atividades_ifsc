<?php
	$dirname = $_POST['txt_dir'];
	$dir = "folder/$dirname";
	
	if (is_dir($dir)) {
		echo "A pasta \"$dirname\" já existe.";
		echo '<br/>';
		echo '<a href="javascript:history.back()">Voltar<a/>';
	} else {
		mkdir($dir, 0777);
		echo '<a href="javascript:history.back()">Voltar<a/>';
	}
	
?>