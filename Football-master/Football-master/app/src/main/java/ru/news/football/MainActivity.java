package vido.luka.chorvatkia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import vido.luka.chorvatkia.last_activity.NewsTwo;

public class MainActivity extends BaseMainActivity {

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
                startActivity(new Intent(MainActivity.this, NewsTwo.class));
            }
        });
        setView("Тренер Хорватии нашел преимущество у сборной России",
                R.drawable.erwefwefwe,
                "Главный тренер сборной Хорватии Златко Далич рассказал о сильных сторонах сборной России перед матчем 1/4 финала чемпионата мира 2018 года. Его слова приводит Sport24.ru\n" +
                        "\n" +
                        "«Мы понимаем, что матч против сборной России будет сложным. У нашего соперника в составе есть хорошие игроки. Команда в целом умеет играть и сдерживать противника на индивидуальном уровне. Мы понимаем, что поддержка стадиона будет придавать им дополнительные силы, но мы ничего не боимся», — заявил Далич.\n" +
                        "\n" +
                        "1 июля сборная России впервые в истории пробилась в 1/4 финала чемпионата мира. Благодаря сейвам Игоря Акинфеева россияне победили испанцев в послематчевой серии пенальти со счетом 4:3. Хорватия также обыграла датчан в серии пенальти — 3:2.\n" +
                        "\n" +
                        "Матч между Россией и Хорватией пройдет 7 июля в Сочи. Игра начнется в 21:00 по московскому времени.");
    }
}
