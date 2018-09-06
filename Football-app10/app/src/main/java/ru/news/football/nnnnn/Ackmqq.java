package kabz.on.foreva.life.nnnnn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import kabz.on.foreva.life.MMSASAD;
import kabz.on.foreva.life.R;

public class Ackmqq extends MMSASAD {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oiuqwe);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Ackmqq.this, "Возникла ошибка, повторите запрос позже", Toast.LENGTH_SHORT).show();
            }
        });
        setView("ЦСКА седьмой раз подряд выиграл Единую лигу ВТБ",
R.drawable.fd3,
                "Московский ЦСКА обыграл подмосковные «Химки» в финале Единой лиги ВТБ. Об этом сообщает корреспондент «Ленты.ру».\n" +
                        "\n" +
                        "Встреча состоялась в воскресенье, 10 июня, и завершилась победой армейцев со счетом 95:84 (27:18, 27:23, 25:28, 16:15). Самым результативным стал защитник «Химок» Алексей Швед (21 очко). Самым ценным игроком «Финала четырех» был признан разыгрывающий ЦСКА Серхио Родригес.\n" +
                        "\n" +
                        "В матче за третье место санкт-петербургский «Зенит» оказался сильнее казанского УНИКСА –– 93:79.\n" +
                        "\n" +
                        "ЦСКА завоевал титул чемпиона Единой лиги ВТБ седьмой раз подряд. В полуфинале армейцы обыграли «Зенит», а химчане –– УНИКС.\n" +
                        "\n" +
                        "В нынешнем сезоне чемпион турнира определялся в «Финале четырех». Решение о смене формата заключительной части турнира принимался на Совете лиги при участии представителей всех команд-участниц..");
    }
}
