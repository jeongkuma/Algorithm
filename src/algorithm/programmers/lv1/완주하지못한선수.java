package algorithm.programmers.lv1;

import java.util.HashMap;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를
 * 작성해주세요.
 *
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	completion	return
 * ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
 * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
 * ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
 * 입출력 예 설명
 * 예제 #1
 * "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 *
 * 예제 #2
 * "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 *
 * 예제 #3
 * "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
public class 완주하지못한선수 {
    public static void main(String[] args) {
//        String[] participant = {"kiki", "leo", "eden"};
//        String[] completion = {"eden", "kiki"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav", "mislav"};

        System.out.println(practice(participant, completion));

    }
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> temp = new HashMap<>();
        for (String name : participant) {
            if (temp.containsKey(name)) {
                temp.put(name, temp.get(name) + 1);
            } else {
                temp.put(name, 1);
            }
        }

        for (String name : completion) {
            if (temp.get(name) == 1) {
                temp.remove(name);
            } else {
                temp.put(name, temp.get(name) - 1);
            }
        }

        answer = temp.keySet().toString().substring(1, temp.keySet().toString().length() - 1);

        return answer;
    }

    public static String practice(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> temp = new HashMap<>();
        for (String name : participant) {
            if (temp.containsKey(name)) {
                temp.put(name, temp.get(name) + 1);
            } else {
                temp.put(name, 1);
            }
        }

        for (String name : completion) {
            if (temp.get(name) == 1) {
                temp.remove(name);
            } else {
                temp.put(name, temp.get(name) - 1);
            }
        }

        System.out.println("temp keySet :: after");

        for (String name : temp.keySet()) {
            System.out.println(name + " : " + temp.get(name));
        }

        answer = temp.keySet().toString().substring(1, temp.keySet().toString().length() - 1);

        return answer;

//        String temp[] = new String[participant.length];
//
//        int i = 0;
//        for (String part : participant) {
//            boolean chk = false;
//            for (String comp : completion) {
//                if (part.equals(comp)) {
//                    chk = true;
//                    for (String t : temp) {
//                        if (part.equals(t)) {
//                            return part;
//                        }
//                    }
//                    temp[i] = part;
//                    i++;
//                }
//            }
//            if (!chk) {
//                return part;
//            }
//        }

//        for (String comp : completion) {
//            int cnt = 0;
//            for (String part : participant) {
//                if (part.equals(comp)) {
//                    cnt++;
//                }
//            }
//            if (cnt > 1 || cnt == 0) {
//                answer = comp;
//            }
//        }



//        for (String name : participant) {
//            if (!Arrays.stream(completion).anyMatch(c -> c.equals(name))) {
//                answer = name;
//            }
//        }

//        for (int i = 0; i < participant.length; i++) {
//            for (int j = 0; j < completion.length; j++) {
//                if (participant[i].equals(completion[j])) {
//                    temp[i] = participant[i];
//                    break;
//                }
//            }
//        }
//
//
//
//        for (String name : temp) {
//            System.out.println(name);
//        }

//        for (String parti : participant) {
//            for (String comp : completion) {
//                if (parti.equals(comp)) {
//                    temp[i] = parti;
//                    break;
//                }
//            }
//        }
//
//        for (String parti : participant) {
//            for (String t : temp) {
//
//            }
//        }

//        for (String name : participant) {
//            if (!Arrays.stream(completion).anyMatch(c -> c.equals(name))) {
//                answer = name;
//            } else {
//                temp[pos] = name;
//            }
//            if (Arrays.stream(temp).anyMatch(d -> d.equals(name))) {
//                answer = name;
//                break;
//            }
//            pos++;
//
//        }
    }
}
