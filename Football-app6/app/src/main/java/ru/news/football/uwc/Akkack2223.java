package tonny.howk.pro.skyter.uwc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import tonny.howk.pro.skyter.PcowqActv;
import tonny.howk.pro.skyter.R;

public class Akkack2223 extends PcowqActv {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onNormalResume();
    }

    @Override
    protected void onNormalResume() {
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_next1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Akkack2223.this, "Ошибка при зарузке данных, попробуйте позже.", Toast.LENGTH_SHORT).show();
            }
        });
        setView("Александр Емельяненко дал совет критиковавшим сборную России «скотам»",
R.drawable.iitue,
                "Российский боец смешанного стиля (MMA) Александр Емельяненко высказался относительно тех, кто критиковал сборную России до того, как она вышла из группы на чемпионате мира-2018. Об этом сообщает «Спорт-Экспресс».\n" +
                        "\n" +
                        "«Да хоть бы один извинился, хоть бы одна скотина. После всего, что они наговорили, хоть кто-то бы признал свою ошибку. Но они спрячутся как всегда в своих аккаунтах», — возмутился Емельяненко. Боец также отметил, что сборной было тяжело, и посоветовал ее хейтерам самим попробовать сыграть в футбол, чтобы те попробовали «это на своей шкуре».\n" +
                        "\n" +
                        "20 июня сборная России досрочно вышла в 1/8 финала чемпионата мира благодаря победе команды Уругвая над Саудовской Аравией (1:0). Россияне преодолели групповой этап турнира впервые в истории.\n" +
                        "\n" +
                        "19 июня команда Станислава Черчесова переиграла египтян со счетом 3:1, вплотную приблизившись к выходу из группы. Египет после поражения от россиян потерял шансы на попадание в плей-офф.\n" +
                        "\n" +
                        "14 июня в матче открытия чемпионата мира сборная России разгромила Саудовскую Аравию. Россияне отправили в ворота саудовцев пять безответных мячей.\n" +
                        "\n" +
                        "Емельяненко профессионально выступает в MMA с 2003 года и является бывшим чемпионом мира по версии ProFc.");
    }
}
