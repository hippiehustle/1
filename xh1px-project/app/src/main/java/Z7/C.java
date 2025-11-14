package Z7;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class C implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final C f7540a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7541b = new X("kotlin.time.Instant", X7.d.f7061m);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        int i4;
        J7.i h8;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z8;
        int i14;
        int i15;
        long j;
        char charAt;
        char charAt2;
        J7.d dVar = J7.d.f2512f;
        String A2 = bVar.A();
        o6.j.e(A2, "input");
        if (A2.length() == 0) {
            h8 = new J7.g("An empty string is not a valid Instant", A2);
        } else {
            char charAt3 = A2.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i4 = 0;
                charAt3 = ' ';
            } else {
                i4 = 1;
            }
            int i16 = 0;
            int i17 = i4;
            while (i17 < A2.length() && '0' <= (charAt2 = A2.charAt(i17)) && charAt2 < ':') {
                i16 = (i16 * 10) + (A2.charAt(i17) - '0');
                i17++;
            }
            int i18 = i17 - i4;
            if (i18 > 10) {
                h8 = J7.f.i(A2, "Expected at most 10 digits for the year number, got " + i18 + " digits");
            } else if (i18 == 10 && o6.j.f(A2.charAt(i4), 50) >= 0) {
                h8 = J7.f.i(A2, "Expected at most 9 digits for the year number or year 1000000000, got " + i18 + " digits");
            } else if (i18 < 4) {
                h8 = J7.f.i(A2, "The year number must be padded to 4 digits, got " + i18 + " digits");
            } else if (charAt3 == '+' && i18 == 4) {
                h8 = J7.f.i(A2, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i18 != 4) {
                h8 = J7.f.i(A2, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i16 = -i16;
                }
                int i19 = i17 + 16;
                if (A2.length() < i19) {
                    h8 = J7.f.i(A2, "The input string is too short");
                } else {
                    J7.g h9 = J7.f.h(A2, "'-'", i17, new H7.o(3));
                    if (h9 == null) {
                        h8 = J7.f.h(A2, "'-'", i17 + 3, new H7.o(4));
                        if (h8 == null && (h8 = J7.f.h(A2, "'T' or 't'", i17 + 6, new H7.o(5))) == null && (h8 = J7.f.h(A2, "':'", i17 + 9, new H7.o(6))) == null && (h8 = J7.f.h(A2, "':'", i17 + 12, new H7.o(7))) == null) {
                            for (int i20 = 0; i20 < 10; i20++) {
                                h9 = J7.f.h(A2, "an ASCII digit", J7.f.f2517b[i20] + i17, new H7.o(8));
                                if (h9 == null) {
                                }
                            }
                            int j5 = J7.f.j(A2, i17 + 1);
                            int j8 = J7.f.j(A2, i17 + 4);
                            int j9 = J7.f.j(A2, i17 + 7);
                            int j10 = J7.f.j(A2, i17 + 10);
                            int j11 = J7.f.j(A2, i17 + 13);
                            int i21 = i17 + 15;
                            if (A2.charAt(i21) == '.') {
                                i21 = i19;
                                int i22 = 0;
                                while (i21 < A2.length() && '0' <= (charAt = A2.charAt(i21)) && charAt < ':') {
                                    i22 = (i22 * 10) + (A2.charAt(i21) - '0');
                                    i21++;
                                }
                                int i23 = i21 - i19;
                                if (1 <= i23 && i23 < 10) {
                                    i8 = i22 * J7.f.f2516a[9 - i23];
                                } else {
                                    h8 = J7.f.i(A2, "1..9 digits are supported for the fraction of the second, got " + i23 + " digits");
                                }
                            } else {
                                i8 = 0;
                            }
                            if (i21 >= A2.length()) {
                                h8 = J7.f.i(A2, "The UTC offset at the end of the string is missing");
                            } else {
                                char charAt4 = A2.charAt(i21);
                                if (charAt4 != '+' && charAt4 != '-') {
                                    if (charAt4 != 'Z' && charAt4 != 'z') {
                                        h8 = J7.f.i(A2, "Expected the UTC offset at position " + i21 + ", got '" + charAt4 + '\'');
                                    } else {
                                        int i24 = i21 + 1;
                                        if (A2.length() == i24) {
                                            i12 = 0;
                                            if (1 > j5) {
                                            }
                                            h8 = J7.f.i(A2, "Expected a month number in 1..12, got " + j5);
                                        } else {
                                            h8 = J7.f.i(A2, "Extra text after the instant at position " + i24);
                                        }
                                    }
                                } else {
                                    int length = A2.length() - i21;
                                    if (length > 9) {
                                        h8 = J7.f.i(A2, "The UTC offset string \"" + J7.f.n(A2.subSequence(i21, A2.length()).toString(), 16) + "\" is too long");
                                    } else if (length % 3 != 0) {
                                        h8 = J7.f.i(A2, "Invalid UTC offset string \"" + A2.subSequence(i21, A2.length()).toString() + '\"');
                                    } else {
                                        int i25 = 0;
                                        for (int i26 = 2; i25 < i26; i26 = 2) {
                                            int i27 = i21 + J7.f.f2518c[i25];
                                            if (i27 >= A2.length()) {
                                                break;
                                            }
                                            if (A2.charAt(i27) != ':') {
                                                StringBuilder j12 = AbstractC1149a.j(i27, "Expected ':' at index ", ", got '");
                                                j12.append(A2.charAt(i27));
                                                j12.append('\'');
                                                h8 = J7.f.i(A2, j12.toString());
                                                break;
                                            }
                                            i25++;
                                        }
                                        int i28 = 0;
                                        while (i28 < 6 && (i13 = J7.f.f2519d[i28] + i21) < A2.length()) {
                                            char charAt5 = A2.charAt(i13);
                                            int i29 = i28;
                                            if ('0' <= charAt5 && charAt5 < ':') {
                                                i28 = i29 + 1;
                                            } else {
                                                StringBuilder j13 = AbstractC1149a.j(i13, "Expected an ASCII digit at index ", ", got '");
                                                j13.append(A2.charAt(i13));
                                                j13.append('\'');
                                                h8 = J7.f.i(A2, j13.toString());
                                                break;
                                            }
                                        }
                                        int j14 = J7.f.j(A2, i21 + 1);
                                        if (length > 3) {
                                            i9 = J7.f.j(A2, i21 + 4);
                                        } else {
                                            i9 = 0;
                                        }
                                        if (length > 6) {
                                            i10 = J7.f.j(A2, i21 + 7);
                                        } else {
                                            i10 = 0;
                                        }
                                        if (i9 > 59) {
                                            h8 = J7.f.i(A2, "Expected offset-minute-of-hour in 0..59, got " + i9);
                                        } else if (i10 > 59) {
                                            h8 = J7.f.i(A2, "Expected offset-second-of-minute in 0..59, got " + i10);
                                        } else if (j14 > 17 && (j14 != 18 || i9 != 0 || i10 != 0)) {
                                            h8 = J7.f.i(A2, "Expected an offset in -18:00..+18:00, got " + A2.subSequence(i21, A2.length()).toString());
                                        } else {
                                            int i30 = (i9 * 60) + (j14 * 3600) + i10;
                                            if (charAt4 == '-') {
                                                i11 = -1;
                                            } else {
                                                i11 = 1;
                                            }
                                            i12 = i30 * i11;
                                            if (1 > j5 && j5 < 13) {
                                                if (1 <= j8) {
                                                    int i31 = i16 & 3;
                                                    if (i31 == 0 && (i16 % 100 != 0 || i16 % 400 == 0)) {
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    if (j5 != 2) {
                                                        if (j5 != 4 && j5 != 6 && j5 != 9 && j5 != 11) {
                                                            i14 = 31;
                                                        } else {
                                                            i14 = 30;
                                                        }
                                                    } else if (z8) {
                                                        i14 = 29;
                                                    } else {
                                                        i14 = 28;
                                                    }
                                                    if (j8 <= i14) {
                                                        if (j9 > 23) {
                                                            h8 = J7.f.i(A2, "Expected hour in 0..23, got " + j9);
                                                        } else if (j10 > 59) {
                                                            h8 = J7.f.i(A2, "Expected minute-of-hour in 0..59, got " + j10);
                                                        } else if (j11 > 59) {
                                                            h8 = J7.f.i(A2, "Expected second-of-minute in 0..59, got " + j11);
                                                        } else {
                                                            long j15 = i16;
                                                            long j16 = 365 * j15;
                                                            if (j15 >= 0) {
                                                                i15 = i12;
                                                                j = ((j15 + 399) / 400) + (((3 + j15) / 4) - ((99 + j15) / 100)) + j16;
                                                            } else {
                                                                i15 = i12;
                                                                j = j16 - ((j15 / (-400)) + ((j15 / (-4)) - (j15 / (-100))));
                                                            }
                                                            long j17 = j + (((j5 * 367) - 362) / 12) + (j8 - 1);
                                                            if (j5 > 2) {
                                                                j17 = (i31 == 0 && (i16 % 100 != 0 || i16 % 400 == 0)) ? (-1) + j17 : j17 - 2;
                                                            }
                                                            h8 = new J7.h(i8, (((j17 - 719528) * 86400) + (((j10 * 60) + (j9 * 3600)) + j11)) - i15);
                                                        }
                                                    }
                                                }
                                                h8 = J7.f.i(A2, "Expected a valid day-of-month for month " + j5 + " of year " + i16 + ", got " + j8);
                                            } else {
                                                h8 = J7.f.i(A2, "Expected a month number in 1..12, got " + j5);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    h8 = h9;
                    break;
                }
            }
        }
        return h8.toInstant();
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        J7.d dVar = (J7.d) obj;
        o6.j.e(dVar, "value");
        cVar.t(dVar.toString());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7541b;
    }
}
