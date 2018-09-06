package alfred.kracken.hitckog.net;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import alfred.kracken.hitckog.net.kmsadklmasd.IUas;

public class Masndasda extends Basvsadq {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oijqw);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Masndasda.this, IUas.class));
            }
        });
        setView("Новые правила фигурного катания посчитали направленными против Загитовой",
                R.drawable.fggg1,
                "Двукратный олимпийский чемпион по фигурному катанию Максим Траньков прокомментировал изменения в правилах начисления дополнительных коэффициентов за прыжки во второй части программы. Его слова приводит «Чемпионат.com» со ссылкой на телеканал «Санкт-Петербург».\n" +
                        "\n" +
                        "«Те тренеры, которые работают с одиночниками, — конечно, для них подготовка изменится. Особенно это касается группы Этери Тутберидзе — у них была сделана ставка на прыжки во второй половине. Теперь придется пересмотреть и хореографическую работу», — заявил Траньков.\n" +
                        "\n" +
                        "По мнению олимпийского чемпиона, именно российские фигуристки славились исполнением прыжков во второй половине программы. «Я думаю, что прецедент был создан на Играх, потому что именно Алина Загитова, олимпийская чемпионка, выполняла все прыжковые элементы во второй половине программы, набирала большие бонусы и за счет этого выигрывала», — добавил он.\n" +
                        "\n" +
                        "6 июня Международный союз конькобежцев (ISU) утвердил поправки к правилу о начислении бонусных баллов за прыжки фигуристов во второй половине программы. Новые правила начнут действовать на всех соревнованиях со следующего сезона.");
    }
}
