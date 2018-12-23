package com.landofai.morsecode;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.Toast;

/**
 * Created by Admin on 23-11-2018.
 */

public class Menu1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_glossary, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Glossary");


        @SuppressWarnings("ConstantConditions") final CustomView a = (CustomView) getView().findViewById(R.id.tabA);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView b = (CustomView) getView().findViewById(R.id.tabB);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(b.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView c = (CustomView) getView().findViewById(R.id.tabC);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(c.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView d = (CustomView) getView().findViewById(R.id.tabD);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(d.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView e = (CustomView) getView().findViewById(R.id.tabE);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(e.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView f = (CustomView) getView().findViewById(R.id.tabF);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(f.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView g = (CustomView) getView().findViewById(R.id.tabG);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(g.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView h = (CustomView) getView().findViewById(R.id.tabH);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(h.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView i = (CustomView) getView().findViewById(R.id.tabI);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(i.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView j = (CustomView) getView().findViewById(R.id.tabJ);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(j.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView k = (CustomView) getView().findViewById(R.id.tabK);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(k.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView l = (CustomView) getView().findViewById(R.id.tabL);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(l.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView m = (CustomView) getView().findViewById(R.id.tabM);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(m.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView n = (CustomView) getView().findViewById(R.id.tabN);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(n.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView o = (CustomView) getView().findViewById(R.id.tabO);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(o.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView p = (CustomView) getView().findViewById(R.id.tabP);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(p.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView q = (CustomView) getView().findViewById(R.id.tabQ);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(q.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView r = (CustomView) getView().findViewById(R.id.tabR);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(r.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView s = (CustomView) getView().findViewById(R.id.tabS);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(s.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView t = (CustomView) getView().findViewById(R.id.tabT);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(t.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView u = (CustomView) getView().findViewById(R.id.tabU);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(u.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView v = (CustomView) getView().findViewById(R.id.tabV);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(v.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView w = (CustomView) getView().findViewById(R.id.tabW);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(w.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView x = (CustomView) getView().findViewById(R.id.tabX);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(x.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView y = (CustomView) getView().findViewById(R.id.tabY);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(y.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView z = (CustomView) getView().findViewById(R.id.tabZ);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(z.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a1 = (CustomView) getView().findViewById(R.id.tab1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a1.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a2 = (CustomView) getView().findViewById(R.id.tab2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a2.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a3 = (CustomView) getView().findViewById(R.id.tab3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a3.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a4 = (CustomView) getView().findViewById(R.id.tab4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a4.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a5 = (CustomView) getView().findViewById(R.id.tab5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a5.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a6 = (CustomView) getView().findViewById(R.id.tab6);
        a6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a6.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a7 = (CustomView) getView().findViewById(R.id.tab7);
        a7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a7.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a8 = (CustomView) getView().findViewById(R.id.tab8);
        a8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a8.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a9 = (CustomView) getView().findViewById(R.id.tab9);
        a9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a9.getRightText());
            }
        });

        @SuppressWarnings("ConstantConditions") final CustomView a0 = (CustomView) getView().findViewById(R.id.tab0);
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSound(a0.getRightText());
            }
        });


        TableLayout bgAlpha = getView().findViewById(R.id.GlossTableAlpha);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            bgAlpha.setElevation(15);
        }

        TableLayout bgNum =  getView().findViewById(R.id.GlossTableNum);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            bgNum.setElevation(15);
        }

    }
    private void playSound(String inStr) {

        final String input = inStr;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_MUSIC, 70);
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == '.') {
                        tg.startTone(ToneGenerator.TONE_DTMF_7, 200);
                        try {
                            Thread.sleep(350);
                            tg.stopTone();
                        } catch (InterruptedException ex) {

                        }
                    }
                    if (input.charAt(i) == '-') {

                        tg.startTone(ToneGenerator.TONE_DTMF_7, 450);
                        try {
                            Thread.sleep(550);
                            tg.stopTone();
                        } catch (InterruptedException ex) {

                        }
                    } else if (input.charAt(i) == ' ') {
                        try {
                            Thread.sleep(250);
                            tg.stopTone();
                        } catch (InterruptedException ex) {

                        }
                    }
                }
            }
        });
        t1.start();

    }
}