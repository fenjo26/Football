package dzvon.dzvonechku.sokoly.soookc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import dzvon.dzvonechku.sokoly.Glavsddkl;
import dzvon.dzvonechku.sokoly.R;

public class Kadd2 extends Glavsddkl {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        onNormalResume();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kadd2.this, Actym3.class));
            }
        });
        setView("Овечкин прилетел в Москву без Кубка Стэнли",
                R.drawable.trewasdf,
"Нападающий клуба Национальной хоккейной лиги (НХЛ) «Вашингтон Кэпиталс» Александр Овечкин прилетел в Москву без Кубка Стэнли. Об этом в воскресенье, 24 июня, сообщает ТАСС.\n" +
        "\n" +
        "Как отмечает агентство, график путешествия трофея еще не утвержден. По традиции, каждый из хоккеистов, завоевавших кубок, может отвезти его к себе на родину.\n" +
        "\n" +
        "7 июня «Вашингтон Кэпиталс», капитаном которого является Овечкин, стал обладателем Кубка Стэнли, победив в пятом матче финальной серии «Вегас Голден Найтс».\n" +
        "\n" +
        "32-летний Овечкин с 2005 года выступает за «Вашингтон». В этом сезоне форвард впервые вышел с командой в финал Кубка Стэнли и впервые завоевал трофей. В активе форварда три победы на чемпионатах мира вместе со сборной России (2008, 2012, 2014)."        );
    }
}
