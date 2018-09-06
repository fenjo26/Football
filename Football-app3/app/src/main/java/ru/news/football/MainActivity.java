package sehrg.jyttttt.jher.yyyyy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import sehrg.jyttttt.jher.yyyyy.lllsadsa.Trvfd2sdv;

public class MainActivity extends GfsdsdckABSes {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Trvfd2sdv.class));
            }
        });
        setView("Определились все четвертьфиналисты чемпионата мира",
                R.drawable.ppopiiicd,
                "Сборная Англии обыграла команду Колумбии в матче 1/8 финала чемпионата мира. Об этом сообщает корреспондент «Ленты.ру».\n" +
                        "\n" +
                        "Встреча прошла во вторник, 3 июля, в Москве. В основное время команды обменялись забитыми мячами. В составе англичан гол на счету Харри Кейна. На 57-й минуте форвард реализовал пенальти. В компенсированное время защитник Йерри Мина головой сравнял счет. В дополнительное время команды голов не забили. В серии пенальти точнее оказались англичане — 4:3.\n" +
                        "\n" +
                        "Ранее 3 июля сборная Швеции оказалась сильнее Швейцарии — 1:0. Теперь скандинавы сыграют с Англией, их встреча пройдет 7 июля. Остальные пары в 1/4 финала распределились следующим образом:\n" +
                        "\n" +
                        "Уругвай — Франция (6 июля, 17:00)\n" +
                        "\n" +
                        "Бразилия — Бельгия (6 июля, 21:00)\n" +
                        "\n" +
                        "Россия — Хорватия (7 июля, 21:00).\n" +
                        "\n" +
                        "Чемпионат мира проходит в 11 городах России. Турнир завершится 15 июля, финал состоится в московских «Лужниках».");
    }
}
