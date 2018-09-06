package vido.luka.chorvatkia.last_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import vido.luka.chorvatkia.BaseMainActivity;
import vido.luka.chorvatkia.MainActivity;
import vido.luka.chorvatkia.R;

public class NewsTwo extends BaseMainActivity {

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
                startActivity(new Intent(NewsTwo.this, Activity3Article.class));
            }
        });
        setView("Успехи России на ЧМ сравнили с потемкинскими деревнями",
                R.drawable.qweqwe23,
                "Спортивный журналист Джонатан Лю порассуждал о причине успехов сборной России на домашнем чемпионате мира по футболу и сравнил их с потемкинскими деревнями. Материал появился в британском Independent.\n" +
                        "\n" +
                        "«Чемпионат мира: реальна ли российская футбольная революция, или это всего лишь потемкинские деревни?» — задается вопросом автор в заголовке материала." +
                        "\n" +
                        "По мнению Лю, российская сборная пробилась в четвертьфинал домашнего мундиаля вопреки логике. Он также упомянул, что победа над испанцами в серии пенальти вызвала бурные народные гуляния, которые Кремль сравнил с празднованиями победы над нацистской Германией. Автор также отмечает, что россияне получат шесть дней на восстановление и подготовку к матчу четвертьфинала против сборной Хорватии — больше, чем любой другой из победителей 1/8 финала.\n" +
                        "\n" +
                        "2 июля испанский журналист Эдуардо Кастелао пренебрежительно отозвался об игре сборной России. Колумнист El Mundo назвал команду Станислава Черчесова одним из слабейших соперников сборной Испании в истории.\n" +
                        "\n" +
                        "1 июля российская сборная обыграла испанцев в серии послематчевых пенальти со счетом 4:3. Следующий матч национальная команда проведет против хорватов. Встреча состоится 7 июля в Сочи. Матч начнется в 21:00 по московскому времени."
        );
    }
}
