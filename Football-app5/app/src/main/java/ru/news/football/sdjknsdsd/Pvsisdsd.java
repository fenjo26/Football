package dfkk.jgge.jdber.reerr.sdjknsdsd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dfkk.jgge.jdber.reerr.BasvseAct;
import dfkk.jgge.jdber.reerr.R;

public class Pvsisdsd extends BasvseAct {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.ertoiucvxv);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pvsisdsd.this, Aceuievew.class));
            }
        });
        setView("Овечкин провел ночь с Кубком Стэнли и стал мемом",
                R.drawable.yyyttt,
                "Российский нападающий клуба Национальной хоккейной лиги (НХЛ) «Вашингтон Кэпиталс» Александр Овечкин выложил в Instagram фотографии, на которых он спит в кровати в обнимку с завоеванным Кубком Стэнли.\n" +
                        "\n" +
                        "На одном фото хоккеист лежит, обнимая трофей, на другом — в кадре уже не только форвард с кубком, но и жена Овечкина Анастасия. Пользователи сети обратили внимание на то, что спортсмен не выпускает из рук трофей, и посмеялись над ним.\n" +
                        "\n" +
                        "10 июня Овечкин отметил победу в Кубке Стэнли, искупавшись в фонтане. Вместе с одноклубниками он влез в фонтан на набережной реки Потомак, протекающей по Вашингтону.\n" +
                        "\n" +
                        "«Вашингтон» завоевал трофей 8 июня. Овечкин забросил одну из шайб и был признан самым ценным игроком плей-офф турнира. Это первый Кубок Стэнли в карьере россиянина, выступающего в НХЛ с 2005 года."
        );
    }
}
