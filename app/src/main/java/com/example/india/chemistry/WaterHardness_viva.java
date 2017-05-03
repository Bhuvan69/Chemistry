package com.example.india.chemistry;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class WaterHardness_viva extends AppCompatActivity {


    public static int total = 0, i = 0, j = 0;
    public static int attempted = 0;
    public static int[] right;
    public static int[] wrong;

    static {
        right = new int[10];/*Not sure how this works!!*/
    }

    static {
        wrong = new int[10];
    }

    private Toolbar toolbar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_hardness_viva);


        if (savedInstanceState == null) {
            Fragment question1 = new WH_question1();
            android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.addToBackStack(null).replace(R.id.fragment_container_1, question1).commit();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case android.R.id.home:
                // API 5+ solution
                onBackPressed();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }

    public static class WH_question1 extends android.support.v4.app.Fragment {

        private static Toolbar toolbar;
        private boolean answer = false;
        private int count = 0;

        public WH_question1() {
            //empty constructor.
        }


        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
            ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);

            ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            return inflater.inflate(R.layout.fragment_container, container, false);


        }


        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText(" As energy, E, of a radiation increases, its wavelength, ﾵ,______ ");


            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Increases. ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));

                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 1;
                        j++;

                    }
                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("Decreases");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 3 && answer == false) {
                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(bounce);
                        option2.setBackgroundColor(Color.parseColor("#8BC34A"));

                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 1;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        wrong[j] = 1;
                        j++;


                    }
                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Attains stability.");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));

                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        answer = true;
                        count = 0;
                        wrong[j] = 1;
                        j++;
                    }
                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("All of these");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));

                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 1;
                        j++;

                    }
                }
            });


            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            Fragment question2 = new WH_question2();
                                            android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                                            ft.addToBackStack(null).replace(R.id.fragment_container_1, question2).commit();
                                        }
                                    }

            );


        }


    }

    public static class WH_question2 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question2() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText(" What is the name of an instrument used to measure the absorbance of a coloured compound in solution? ");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Colorimeter");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 3 && answer == false) {
                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(bounce);
                        option1.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 2;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        wrong[j] = 2;
                        j++;
                    }
                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("Coulometer");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(shake);
                        option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 2;
                        j++;

                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Colourmeter.");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        answer = true;
                        count = 0;
                        wrong[j] = 2;
                        j++;
                    }
                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("Calorimeter");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 2;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment question3 = new WH_question3();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question3).commit();


                }
            });

        }
    }

    public static class WH_question3 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question3() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText(" The range of visible region in EM spectra  ");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("100-200nm ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        answer = true;
                        count = 0;
                        wrong[j] = 3;
                        j++;
                    }
                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("500-700nm");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(shake);
                        option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        count = 0;
                        answer = true;
                        wrong[j] = 3;
                        j++;

                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("400-700nm ");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 3 && answer == false) {
                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(bounce);
                        option3.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 3;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is c");
                        count = 0;
                        wrong[j] = 3;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("200-400nm ");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        count = 0;
                        answer = true;
                        wrong[j] = 3;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Fragment question4 = new WH_question4();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question4).commit();


                }
            });

        }
    }

    public static class WH_question4 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question4() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("  Photomultipliers or photocells are used in UV-Visible Spectrophotometers as ");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Detector ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 3 && answer == false) {
                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(bounce);
                        option1.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 4;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        wrong[j] = 4;
                        j++;
                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("Filters ");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(shake);
                        option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 4;
                        j++;

                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Prism ");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        answer = true;
                        count = 0;
                        wrong[j] = 4;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("all the above  ");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 4;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question5 = new WH_question5();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question5).commit();


                }
            });

        }
    }

    public static class WH_question5 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question5() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_2, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText(" Ammonia/KCN is Chromophore  ");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("YES ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count == 0) {
                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(bounce);
                        option1.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 5;/* Adds question number to the ith position in the array*/
                        i++;
                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("NO ");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    option2.setVisibility(View.VISIBLE);
                    option2.startAnimation(shake);
                    option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                    Toast toast = Toast.makeText(getActivity(), "OOPS!!, Its Wrong :(", Toast.LENGTH_SHORT);
                    toast.show();
                    count++;
                    wrong[j] = 5;
                    j++;


                }
            });


            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question6 = new WH_question6();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question6).commit();


                }
            });

        }
    }

    public static class WH_question6 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question6() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("Beer's Law states that;");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText(" Absorbance is proportional to both the path length and concentration of the absorbing species ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 3 && answer == false) {
                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(bounce);
                        option1.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 6;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        wrong[j] = 6;
                        j++;
                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("Absorbance is proportional to the log of the concentration of the absorbing species ");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(shake);
                        option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 6;
                        j++;

                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Absorbance is equal to P0 / P.");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        answer = true;
                        count = 0;
                        wrong[j] = 6;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("None");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is A");
                        count = 0;
                        answer = true;
                        wrong[j] = 6;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question7 = new WH_question7();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question7).commit();


                }
            });

        }
    }

    public static class WH_question7 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question7() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("In which region of the electromagnetic spectrum does an absorption at 600 nm come?");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Near -UV. ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 7;
                        j++;

                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText("Visible.");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (count < 3 && answer == false) {
                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(bounce);
                        option2.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 7;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        wrong[j] = 7;
                        j++;
                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Far-UV");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        answer = true;
                        count = 0;
                        wrong[j] = 7;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("Infrared.");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 7;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question8 = new WH_question8();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question8).commit();


                }
            });

        }
    }

    public static class WH_question8 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question8() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("Color intensity of the solution increased means what happens the absorption of radiation in colorimeter?");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Increases ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 8;
                        j++;

                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText(" Decrases");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (count < 3 && answer == false) {
                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(bounce);
                        option2.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 8;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        wrong[j] = 8;
                        j++;
                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Doesn’t  alters");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        answer = true;
                        count = 0;
                        wrong[j] = 8;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("None of these");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 8;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question9 = new WH_question9();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question9).commit();


                }
            });

        }
    }

    public static class WH_question9 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question9() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("Which complex is formed after addition of Ammonium hydroxide solution to CuSO4?");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("Sulphoammonium complex ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 9;
                        j++;

                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText(" Cuprammonium complex");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (count < 3 && answer == false) {
                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(bounce);
                        option2.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 9;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        wrong[j] = 9;
                        j++;
                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("Both of these");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(shake);
                        option3.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        answer = true;
                        count = 0;
                        wrong[j] = 9;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("None of these");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is B");
                        count = 0;
                        answer = true;
                        wrong[j] = 9;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment question10 = new WH_question10();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, question10).commit();


                }
            });

        }
    }

    public static class WH_question10 extends android.support.v4.app.Fragment {
        private boolean answer = false;
        private int count = 0;

        public WH_question10() {
            //Empty constructor.
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_container, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            final ScrollView layout = (ScrollView) getActivity().findViewById(R.id.quiz_layout);
            final LinearLayout container = (LinearLayout) getActivity().findViewById(R.id.container);

            final Animation shake = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.shake);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);

            TextView question = (TextView) getActivity().findViewById(R.id.quiz_questions);
            question.setText("Why 620nm is used in colorimeter?");

            final TextView option1 = (TextView) getActivity().findViewById(R.id.option_1);
            option1.setText("At particular wavelength, the complex undergoes no absorption of radiation ");
            option1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option1.setVisibility(View.VISIBLE);
                        option1.startAnimation(shake);
                        option1.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;


                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        count = 0;
                        answer = true;
                        wrong[j] = 10;
                        j++;

                    }


                }

            });

            final TextView option2 = (TextView) getActivity().findViewById(R.id.option_2);
            option2.setText(" At particular wavelength, the complex undergoes minimum absorption of radiation ");
            option2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (count < 2 && answer == false) {

                        option2.setVisibility(View.VISIBLE);
                        option2.startAnimation(shake);
                        option2.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        answer = true;
                        count = 0;
                        wrong[j] = 10;
                        j++;
                    }


                }
            });

            final TextView option3 = (TextView) getActivity().findViewById(R.id.option_3);
            option3.setText("At particular wavelength, the complex undergoes maximum absorption of radiation ");
            option3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (count < 3 && answer == false) {
                        option3.setVisibility(View.VISIBLE);
                        option3.startAnimation(bounce);
                        option3.setBackgroundColor(Color.parseColor("#8BC34A"));
                        Toast toast = Toast.makeText(getActivity(), "Awe3some!! :)", Toast.LENGTH_SHORT);
                        toast.show();
                        answer = true;
                        count = 0;
                        total++;
                        right[i] = 10;/* Adds question number to the ith position in the array*/
                        i++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        count = 0;
                        wrong[j] = 10;
                        j++;
                    }


                }
            });

            final TextView option4 = (TextView) getActivity().findViewById(R.id.option_4);
            option4.setText("None of these");
            option4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (count < 2 && answer == false) {

                        option4.setVisibility(View.VISIBLE);
                        option4.startAnimation(shake);
                        option4.setBackgroundColor(Color.parseColor("#ff7f7f"));
                        Toast toast = Toast.makeText(getActivity(), "OOPS!!, Try Again :(", Toast.LENGTH_SHORT);
                        toast.show();
                        count++;

                    } else if (count != 0) {
                        TextView right_answer = new TextView(getActivity());
                        container.addView(right_answer);
                        right_answer.setVisibility(View.VISIBLE);
                        right_answer.startAnimation(bounce);
                        right_answer.setTextSize(20);
                        right_answer.setTextColor(Color.parseColor("#125688"));
                        right_answer.setText("Sorry!! The right answer is C");
                        count = 0;
                        answer = true;
                        wrong[j] = 10;
                        j++;
                    }
                }
            });

            Button next = (Button) getActivity().findViewById(R.id.next_question);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Fragment total = new WH_total();
                    android.support.v4.app.FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                    ft.addToBackStack(null).replace(R.id.fragment_container_1, total).commit();


                }
            });

        }
    }


    public static class WH_total extends android.support.v4.app.Fragment {

        public WH_total() {

        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {


            return inflater.inflate(R.layout.fragment_total, container, false);


        }

        @Override
        public void onViewCreated(View view, Bundle savedInstanceState) {
            LinearLayout layout = (LinearLayout) getActivity().findViewById(R.id.total);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(40, 300, 0, 0);
            final Animation move = AnimationUtils.loadAnimation(getActivity(),
                    R.anim.move);
            final Animation bounce = AnimationUtils.loadAnimation(getActivity(), R.anim.bounce);
            TextView score = new TextView(getActivity());
            layout.addView(score);
            score.setVisibility(View.VISIBLE);
            score.startAnimation(move);
            score.setLayoutParams(params);
            score.setText("Your score is :");
            score.setTextSize(30);
            score.setTextColor(Color.parseColor("#000000"));

            LinearLayout.LayoutParams params1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params1.setMargins(40, 0, 0, 0);

            TextView score_display = new TextView(getActivity());
            layout.addView(score_display);
            score_display.setVisibility(View.VISIBLE);
            score_display.startAnimation(move);
            score_display.setText(String.valueOf(total));
            score_display.setTextSize(20);
            score_display.setTextColor(Color.parseColor("#125688"));
            score_display.setLayoutParams(params1);

            LinearLayout.LayoutParams params2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params2.setMargins(40, 0, 0, 0);


            TextView right_one = new TextView(getActivity());
            layout.addView(right_one);
            right_one.setVisibility(View.VISIBLE);
            right_one.startAnimation(move);
            right_one.setText("Right answers:");
            right_one.setTextColor(Color.parseColor("#000000"));
            right_one.setTextSize(30);
            right_one.setLayoutParams(params2);

            LinearLayout.LayoutParams params3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params3.setMargins(40, 0, 0, 0);

            TextView right_answers = new TextView(getActivity());
            layout.addView(right_answers);
            right_answers.setLayoutParams(params3);
            right_answers.setText("Qno: ");
            right_answers.setTextColor(Color.parseColor("#8BC34A"));
            for (int j = 0; j < i; j++) {
                if (j == 0) {
                    right_answers.append(String.valueOf(right[j]) + ", ");
                } else if (j > 0 && j < i - 1) {
                    right_answers.append(String.valueOf(right[j]) + ",  ");
                } else {
                    right_answers.append(String.valueOf(right[j]) + ".");
                }
            }

            right_answers.setTextSize(20);
            right_answers.setVisibility(View.VISIBLE);
            right_answers.startAnimation(move);


            LinearLayout.LayoutParams params4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params4.setMargins(40, 0, 0, 0);

            TextView wrong_one = new TextView(getActivity());
            layout.addView(wrong_one);
            wrong_one.setVisibility(View.VISIBLE);
            wrong_one.setAnimation(move);
            wrong_one.setText("Wrong answers :");
            wrong_one.setTextColor(Color.parseColor("#000000"));
            wrong_one.setTextSize(30);
            wrong_one.setLayoutParams(params4);

            LinearLayout.LayoutParams params5 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params5.setMargins(40, 0, 0, 0);

            TextView wrong_answers = new TextView((getActivity()));
            layout.addView(wrong_answers);
            wrong_answers.setLayoutParams(params5);
            wrong_answers.setVisibility(View.VISIBLE);
            wrong_answers.setAnimation(move);
            wrong_answers.setText("Qno:");
            wrong_answers.setTextColor(Color.parseColor("#ff7f7f"));
            for (int i = 0; i < j; i++) {
                if (i == 0) {
                    wrong_answers.append(String.valueOf(wrong[i]) + ", ");
                } else if (i > 0 && i < j - 1) {
                    wrong_answers.append(String.valueOf(wrong[i]) + ", ");
                } else {
                    wrong_answers.append(String.valueOf(wrong[j]) + ".");
                }

            }


            wrong_answers.setTextSize(20);
        }
    }


}
