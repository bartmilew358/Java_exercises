package pl.sda.algorithms;

import java.util.ArrayList;
import java.util.List;


//     cHVibGljIHN0YXRpYyB2b2lkIG1haW4oU3RyaW5nW10gYXJncykgewogICAgICAgIGludCBuID0gMTA7CiAgICAgICAgU3lzdGVtLm91dC5wcmludGxuKEFycmF5cy50b1N0cmluZyhmaWIobikpKTsKCiAgICAgICAgLy8gIzEKICAgICAgICBpbnRbXSByZXN1bHQxID0gbmV3IGludFtuXTsKICAgICAgICBTeXN0ZW0ub3V0LnByaW50bG4oQXJyYXlzLnRvU3RyaW5nKGZpYlJlYyhyZXN1bHQxLCBuKSkpOwoKICAgICAgICAvLyAjMgogICAgICAgIGludFtdIHJlc3VsdDIgPSBuZXcgaW50W25dOwogICAgICAgIGZvciAoaW50IGkgPSAxOyBpIDw9IG47IGkrKykgewogICAgICAgICAgICByZXN1bHQyW2kgLSAxXSA9IGZpYm9uYWNjaShpKTsKICAgICAgICB9CiAgICAgICAgU3lzdGVtLm91dC5wcmludGxuKEFycmF5cy50b1N0cmluZyhyZXN1bHQyKSk7CiAgICB9CgogICAgcHJpdmF0ZSBzdGF0aWMgaW50W10gZmliKGludCBpKSB7CiAgICAgICAgaW50W10gcmVzdWx0ID0gbmV3IGludFtpXTsKICAgICAgICByZXN1bHRbMF0gPSAwOwogICAgICAgIHJlc3VsdFsxXSA9IDE7CiAgICAgICAgZm9yIChpbnQgbiA9IDI7IG4gPCBpOyBuKyspIHsKICAgICAgICAgICAgcmVzdWx0W25dID0gcmVzdWx0W24gLSAxXSArIHJlc3VsdFtuIC0gMl07CiAgICAgICAgfQogICAgICAgIHJldHVybiByZXN1bHQ7CiAgICB9CgogICAgcHVibGljIHN0YXRpYyBpbnRbXSBmaWJSZWMoaW50W10gcmVzdWx0LCBpbnQgaSkgewogICAgICAgIGkgPSBpIC0gMTsKICAgICAgICBpZiAoaSA9PSAwKSB7CiAgICAgICAgICAgIHJlc3VsdFtpXSA9IDA7CiAgICAgICAgfQogICAgICAgIGlmIChpID09IDEpIHsKICAgICAgICAgICAgcmVzdWx0W2ldID0gMTsKICAgICAgICB9CiAgICAgICAgaWYgKGkgPiAxKSB7CiAgICAgICAgICAgIGZpYlJlYyhyZXN1bHQsIGkpOwogICAgICAgICAgICByZXN1bHRbaV0gPSByZXN1bHRbaSAtIDFdICsgcmVzdWx0W2kgLSAyXTsKICAgICAgICB9CiAgICAgICAgcmV0dXJuIHJlc3VsdDsKICAgIH0KCiAgICBwdWJsaWMgc3RhdGljIGludCBmaWJvbmFjY2koaW50IG4pIHsKICAgICAgICBpZiAobiA9PSAxKSB7CiAgICAgICAgICAgIHJldHVybiAwOwogICAgICAgIH0KICAgICAgICBpZiAobiA9PSAyKSB7CiAgICAgICAgICAgIHJldHVybiAxOwogICAgICAgIH0KICAgICAgICByZXR1cm4gZmlib25hY2NpKG4gLSAxKSArIGZpYm9uYWNjaShuIC0gMik7CiAgICB9


public class Fibonacci {
    public static void main(String[] args) {

//        System.out.println(Fibonacci(30));
        System.out.println(Fibonacci_rek(30));
    }

    private static int Fibonacci(int n) {

        List<Integer> fibonacci_list = new ArrayList<>();

        fibonacci_list.add(0);
        fibonacci_list.add(1);

        int temp = 0;

        if (n == 0) {
            return 0;
        } else {
            if (n == 1) {
                return 1;
            } else {

                for (int i = 2; i <= n; i++) {
                    temp = fibonacci_list.get(i - 1) + fibonacci_list.get(i - 2);
                    fibonacci_list.add(i , temp);
                }
            }
            n = temp;
        }
        return n;
    }

    private static int Fibonacci_rek (int n) {

        return n<2? n : Fibonacci_rek(n - 1) + Fibonacci_rek(n - 2);
    }
}