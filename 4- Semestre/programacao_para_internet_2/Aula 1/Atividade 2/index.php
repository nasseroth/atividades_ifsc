<?php
$listas = array(
    array(
        'Aluno 1',
        'Aluno 2',
        'Aluno 3',
        'Aluno 4',
        'Aluno 5'
    ) ,
    array(
        array(
            1,
            6,
            7
        ) ,
        array(
            6,
            7,
            8
        ) ,
        array(
            7,
            6,
            5
        ) ,
        array(
            8,
            9,
            7
        ) ,
        array(
            10,
            9,
            10
        )
    )
);
$somaTotal = 0;

foreach ($listas as & $lista)
{
    foreach ($lista as & $aluno)
    {
        $media = 0;
        if (is_array($aluno) || is_object($aluno))
        {
            foreach ($aluno as & $nota)
            {
                $media += $nota;
            }
            $media = $media / 3;

            if ($media >= 6)
            {
                echo "Aluno: {$aluno[0]} - Aprovado, média final {$media} <br>";
            }
            else
            {
                echo "Aluno: {$aluno[0]} - Reprovado, média final {$media} <br>";
            }
        }

    }
}

?>
