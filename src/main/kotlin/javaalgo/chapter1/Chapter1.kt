package javaalgo.chapter1

class Chapter1 {

    // 세 수의 중앙값을 구하는 알고리즘을 작성한다.
    inner class Median {
        fun med3(a: Int, b: Int, c: Int) {
            var med = a
            med = when {
                // a 가 b 보다 크다면
                a > b -> {
                    when {
                        // b 가 c 보다 크거나 같으면 b 를 리턴
                        b >= c -> {
                            b
                        }
                        // b 가 c 보다 작거나 같으면 a 를 리턴
                        a <= c -> {
                            a
                        }
                        // 그 외에는 c 를 리턴
                        else -> {
                            c
                        }
                    }
                }
                // a 가 c 보다 크다면 a 를 리턴
                // 왜? 여기까지 온거는 a 는 이미 b 보다 크지 않으니, b>a 의 대소관계가 성립된다.
                a > c -> {
                    a
                }
                // 왜? 여기까지 온거는 a 는 이미 b 와 c 보다 작기때문에 최솟값, 그래서 b 와 c 만 비교함.
                b > c -> {
                    c
                }
                //
                else -> {
                    b
                }
            }
            println(
                """
                세 정수의 중앙값을 구합니다.
                a : $a
                b : $b
                c : $c
                중앙값은 $med 입니다. 
            """.trimIndent()
            )
        }
    }

    fun Q4(a: Int, b: Int, c: Int) {
        var med = a
        med = when {
            a > b -> {
                when {
                    b >= c -> {
                        b
                    }
                    a <= c -> {
                        a
                    }
                    else -> {
                        c
                    }
                }
            }
            a > c -> {
                a
            }
            b > c -> {
                c
            }
            else -> {
                b
            }
        }
    }

    fun Q5(a: Int, b: Int, c: Int) {
        var med = a
        if ((b >= a && c <= a) || (b <= a && c >= a)) {
            med = a
        } else if ((a > b && c < b) || (a < b && c > b)) {
            med = b
        }
        med = c
        // 이 함수가 상단에 비해서 효율성이 떨어지는 이유는 ?
        // 우선 가독성 자체가 매우 떨어짐.
        // 또한 내부 비교문을 하나하나 다 해야하므로 효율성이 떨어진다고 생각
    }
}
