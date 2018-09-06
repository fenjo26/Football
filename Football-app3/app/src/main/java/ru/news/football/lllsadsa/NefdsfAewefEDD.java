package sehrg.jyttttt.jher.yyyyy.lllsadsa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import sehrg.jyttttt.jher.yyyyy.GfsdsdckABSes;
import sehrg.jyttttt.jher.yyyyy.R;

public class NefdsfAewefEDD extends GfsdsdckABSes {

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
                Toast.makeText(NefdsfAewefEDD.this, "Произошла ошибка загрузки данных.\nПожалуйста, попробуйте позже.", Toast.LENGTH_SHORT).show();
            }
        });
        setView("Аргентинец решил нажиться на продаже билетов на ЧМ и лишился полумиллиона",
R.drawable.billasdasdas,
                "Мировой суд Санкт-Петербурга оштрафовал гражданина Аргентины за незаконное распространение билетов на матчи чемпионата мира по футболу. Об этом сообщает ТАСС со ссылкой на объединенную пресс-службу судов северной столицы.\n" +
                        "\n" +
                        "«Мировой судья вынес постановление о привлечении к административной ответственности гражданина Республики Аргентина Сурбригхена Адолфу Рауля. Ему назначено наказание в виде штрафа в размере 542 998 рублей 80 копеек», — заявили в суде.\n" +
                        "\n" +
                        "Аргентинца признали виновным в спекуляции билетами на матч 1/8 финала между сборными Швеции и Швейцарии. Встреча прошла 3 июля в Санкт-Петербурге и завершилась победой шведов со счетом 1:0. В четвертьфинале чемпионата мира они сыграют с англичанами.\n" +
                        "\n" +
                        "Незадолго до мундиаля в КоАП внесли статью о запрете на продажу билетов на матчи турнира. Она предусматривает штрафы вплоть до 25-кратной стоимости входного билета на игру. Для должностных лиц штраф может составить 30-кратную стоимость билета, для юридических лиц — до миллиона рублей.\n" +
                        "\n" +
                        "Чемпионат мира-2018 проходит в 11 городах России и завершится 15 июля.");
    }
}
