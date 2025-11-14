package N;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f3513b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3514c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f3515d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f3516e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3517a;

    static {
        f fVar = g.f3528c;
        f3513b = Character.toString((char) 8206);
        f3514c = Character.toString((char) 8207);
        f3515d = new b(false);
        f3516e = new b(true);
    }

    public b(boolean z8) {
        f fVar = g.f3526a;
        this.f3517a = z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.f3511c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f3511c = 0;
        int i4 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int i10 = aVar.f3511c;
            if (i10 < aVar.f3510b && i4 == 0) {
                CharSequence charSequence2 = aVar.f3509a;
                char charAt = charSequence2.charAt(i10);
                aVar.f3512d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, aVar.f3511c);
                    aVar.f3511c = Character.charCount(codePointAt) + aVar.f3511c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    aVar.f3511c++;
                    char c6 = aVar.f3512d;
                    if (c6 < 1792) {
                        directionality = a.f3508e[c6];
                    } else {
                        directionality = Character.getDirectionality(c6);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i9++;
                                    i8 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i9++;
                                    i8 = 1;
                                    continue;
                                case 18:
                                    i9--;
                                    i8 = 0;
                                    continue;
                            }
                        }
                    } else if (i9 == 0) {
                    }
                } else if (i9 == 0) {
                }
                i4 = i9;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f3511c = aVar.f3510b;
        int i4 = 0;
        while (true) {
            int i8 = i4;
            while (aVar.f3511c > 0) {
                byte a3 = aVar.a();
                if (a3 != 0) {
                    if (a3 != 1 && a3 != 2) {
                        if (a3 != 9) {
                            switch (a3) {
                                case 14:
                                case 15:
                                    if (i8 == i4) {
                                        return -1;
                                    }
                                    i4--;
                                    break;
                                case 16:
                                case 17:
                                    if (i8 == i4) {
                                        break;
                                    }
                                    i4--;
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i8 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 != 0) {
                        if (i8 == 0) {
                            break;
                        }
                    }
                } else {
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i8 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        f fVar;
        String str;
        f fVar2;
        char c6;
        f fVar3 = g.f3528c;
        if (charSequence == null) {
            return null;
        }
        boolean d2 = fVar3.d(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d2) {
            fVar = g.f3527b;
        } else {
            fVar = g.f3526a;
        }
        boolean d3 = fVar.d(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f3514c;
        String str4 = f3513b;
        boolean z8 = this.f3517a;
        if (!z8 && (d3 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z8 || (d3 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (d2 != z8) {
            if (d2) {
                c6 = 8235;
            } else {
                c6 = 8234;
            }
            spannableStringBuilder.append(c6);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (d2) {
            fVar2 = g.f3527b;
        } else {
            fVar2 = g.f3526a;
        }
        boolean d9 = fVar2.d(charSequence, charSequence.length());
        if (!z8 && (d9 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z8 && (!d9 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
