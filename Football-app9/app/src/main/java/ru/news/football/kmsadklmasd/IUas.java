package alfred.kracken.hitckog.net.kmsadklmasd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import alfred.kracken.hitckog.net.Basvsadq;
import alfred.kracken.hitckog.net.R;

public class IUas extends Basvsadq {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.oijqw);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IUas.this, Ydqwkmd.class));
            }
        });
        setView("Медведева объяснила выбор канадского тренера",
                R.drawable.sasaq,
                "Российская фигуристка Евгения Медведева объяснила, что решила начать работать с канадским тренером Брайаном Орсером из-за двукратной олимпийской чемпионки Ким Ен А, которая занималась в его группе. Слова спортсменки приводит «Р-Спорт».\n" +
                        "\n" +
                        "«Это первое, что мне пришло в голову, когда я стала думать о переходе. Ен А в 19 лет выиграла Олимпиаду в Ванкувере, а в 23 с небольшим стала второй на Играх в Сочи. На Олимпийских играх в Пекине мне будет 22. Дело, конечно же, не в ней одной. У Орсера вообще много спортсменов, которых в фигурном катании принято называть возрастными и кто прошел более одной Олимпиады. Ким Ен А — лишь одна из них», — сказала Медведева.\n" +
                        "\n" +
                        "17 июня фигуристка прибыла в Торонто. Туда она решила переехать после разрыва с тренером Этери Тутберидзе, с которой работала с 2007 года. По словам специалиста, до Олимпийских игр-2018 Медведева просила оставить 15-летнюю Алину Загитову в юниорах еще на год.\n" +
                        "\n" +
                        "В Пхенчхане спортсменка стала обладательницей двух серебряных наград. Золото в женском одиночном катании завоевала Загитова.");
    }
}
