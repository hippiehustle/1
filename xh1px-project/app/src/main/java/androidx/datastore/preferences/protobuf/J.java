package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class J implements S {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f8609n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f8610o = f0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f8611a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8613c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8614d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0465a f8615e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8616f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f8617g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8618h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8619i;
    public final L j;
    public final C0488y k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f8620l;

    /* renamed from: m, reason: collision with root package name */
    public final F f8621m;

    public J(int[] iArr, Object[] objArr, int i4, int i8, AbstractC0465a abstractC0465a, int[] iArr2, int i9, int i10, L l6, C0488y c0488y, Y y4, C0478n c0478n, F f8) {
        this.f8611a = iArr;
        this.f8612b = objArr;
        this.f8613c = i4;
        this.f8614d = i8;
        this.f8616f = abstractC0465a instanceof AbstractC0484u;
        this.f8617g = iArr2;
        this.f8618h = i9;
        this.f8619i = i10;
        this.j = l6;
        this.k = c0488y;
        this.f8620l = y4;
        this.f8615e = abstractC0465a;
        this.f8621m = f8;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder s8 = A.j.s("Field ", str, " for ");
            s8.append(cls.getName());
            s8.append(" not found. Known fields are ");
            s8.append(Arrays.toString(declaredFields));
            throw new RuntimeException(s8.toString());
        }
    }

    public static int K(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0484u) {
            return ((AbstractC0484u) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static J w(Q q6, L l6, C0488y c0488y, Y y4, C0478n c0478n, F f8) {
        int i4;
        int charAt;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt2;
        int i15;
        char charAt3;
        int i16;
        char charAt4;
        int i17;
        char charAt5;
        int i18;
        char charAt6;
        int i19;
        char charAt7;
        int i20;
        char charAt8;
        int i21;
        char charAt9;
        int i22;
        int i23;
        int i24;
        Class<?> cls;
        int i25;
        int objectFieldOffset;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        Field F2;
        char charAt10;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        Object obj;
        Field F8;
        Object obj2;
        Field F9;
        boolean z8;
        int i36;
        char charAt11;
        int i37;
        char charAt12;
        int i38;
        char charAt13;
        int i39;
        char charAt14;
        String str = q6.f8634b;
        int length = str.length();
        int i40 = 55296;
        if (str.charAt(0) >= 55296) {
            int i41 = 1;
            while (true) {
                i4 = i41 + 1;
                if (str.charAt(i41) < 55296) {
                    break;
                }
                i41 = i4;
            }
        } else {
            i4 = 1;
        }
        int i42 = i4 + 1;
        int charAt15 = str.charAt(i4);
        if (charAt15 >= 55296) {
            int i43 = charAt15 & 8191;
            int i44 = 13;
            while (true) {
                i39 = i42 + 1;
                charAt14 = str.charAt(i42);
                if (charAt14 < 55296) {
                    break;
                }
                i43 |= (charAt14 & 8191) << i44;
                i44 += 13;
                i42 = i39;
            }
            charAt15 = i43 | (charAt14 << i44);
            i42 = i39;
        }
        if (charAt15 == 0) {
            i9 = 0;
            i12 = 0;
            charAt = 0;
            i8 = 0;
            i11 = 0;
            i13 = 0;
            iArr = f8609n;
            i10 = 0;
        } else {
            int i45 = i42 + 1;
            int charAt16 = str.charAt(i42);
            if (charAt16 >= 55296) {
                int i46 = charAt16 & 8191;
                int i47 = 13;
                while (true) {
                    i21 = i45 + 1;
                    charAt9 = str.charAt(i45);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i46 |= (charAt9 & 8191) << i47;
                    i47 += 13;
                    i45 = i21;
                }
                charAt16 = i46 | (charAt9 << i47);
                i45 = i21;
            }
            int i48 = i45 + 1;
            int charAt17 = str.charAt(i45);
            if (charAt17 >= 55296) {
                int i49 = charAt17 & 8191;
                int i50 = 13;
                while (true) {
                    i20 = i48 + 1;
                    charAt8 = str.charAt(i48);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i49 |= (charAt8 & 8191) << i50;
                    i50 += 13;
                    i48 = i20;
                }
                charAt17 = i49 | (charAt8 << i50);
                i48 = i20;
            }
            int i51 = i48 + 1;
            int charAt18 = str.charAt(i48);
            if (charAt18 >= 55296) {
                int i52 = charAt18 & 8191;
                int i53 = 13;
                while (true) {
                    i19 = i51 + 1;
                    charAt7 = str.charAt(i51);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                    i51 = i19;
                }
                charAt18 = i52 | (charAt7 << i53);
                i51 = i19;
            }
            int i54 = i51 + 1;
            int charAt19 = str.charAt(i51);
            if (charAt19 >= 55296) {
                int i55 = charAt19 & 8191;
                int i56 = 13;
                while (true) {
                    i18 = i54 + 1;
                    charAt6 = str.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i55 |= (charAt6 & 8191) << i56;
                    i56 += 13;
                    i54 = i18;
                }
                charAt19 = i55 | (charAt6 << i56);
                i54 = i18;
            }
            int i57 = i54 + 1;
            charAt = str.charAt(i54);
            if (charAt >= 55296) {
                int i58 = charAt & 8191;
                int i59 = 13;
                while (true) {
                    i17 = i57 + 1;
                    charAt5 = str.charAt(i57);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i58 |= (charAt5 & 8191) << i59;
                    i59 += 13;
                    i57 = i17;
                }
                charAt = i58 | (charAt5 << i59);
                i57 = i17;
            }
            int i60 = i57 + 1;
            int charAt20 = str.charAt(i57);
            if (charAt20 >= 55296) {
                int i61 = charAt20 & 8191;
                int i62 = 13;
                while (true) {
                    i16 = i60 + 1;
                    charAt4 = str.charAt(i60);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i61 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i60 = i16;
                }
                charAt20 = i61 | (charAt4 << i62);
                i60 = i16;
            }
            int i63 = i60 + 1;
            int charAt21 = str.charAt(i60);
            if (charAt21 >= 55296) {
                int i64 = charAt21 & 8191;
                int i65 = 13;
                while (true) {
                    i15 = i63 + 1;
                    charAt3 = str.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i65;
                    i65 += 13;
                    i63 = i15;
                }
                charAt21 = i64 | (charAt3 << i65);
                i63 = i15;
            }
            int i66 = i63 + 1;
            int charAt22 = str.charAt(i63);
            if (charAt22 >= 55296) {
                int i67 = charAt22 & 8191;
                int i68 = 13;
                while (true) {
                    i14 = i66 + 1;
                    charAt2 = str.charAt(i66);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i67 |= (charAt2 & 8191) << i68;
                    i68 += 13;
                    i66 = i14;
                }
                charAt22 = i67 | (charAt2 << i68);
                i66 = i14;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i69 = (charAt16 * 2) + charAt17;
            int i70 = charAt20;
            i8 = charAt18;
            i9 = i70;
            i10 = charAt16;
            i42 = i66;
            iArr = iArr2;
            i11 = charAt19;
            i12 = i69;
            i13 = charAt22;
        }
        Unsafe unsafe = f8610o;
        Object[] objArr = q6.f8635c;
        Class<?> cls2 = q6.f8633a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr2 = new Object[charAt * 2];
        int i71 = i13 + i9;
        int i72 = i71;
        int i73 = i13;
        int i74 = 0;
        int i75 = 0;
        while (i42 < length) {
            int i76 = i42 + 1;
            int charAt23 = str.charAt(i42);
            if (charAt23 >= i40) {
                int i77 = charAt23 & 8191;
                int i78 = i76;
                int i79 = 13;
                while (true) {
                    i38 = i78 + 1;
                    charAt13 = str.charAt(i78);
                    i22 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i77 |= (charAt13 & 8191) << i79;
                    i79 += 13;
                    i78 = i38;
                    length = i22;
                }
                charAt23 = i77 | (charAt13 << i79);
                i23 = i38;
            } else {
                i22 = length;
                i23 = i76;
            }
            int i80 = i23 + 1;
            int charAt24 = str.charAt(i23);
            Object[] objArr3 = objArr;
            char c6 = 55296;
            if (charAt24 >= 55296) {
                int i81 = charAt24 & 8191;
                int i82 = 13;
                while (true) {
                    i37 = i80 + 1;
                    charAt12 = str.charAt(i80);
                    if (charAt12 < c6) {
                        break;
                    }
                    i81 |= (charAt12 & 8191) << i82;
                    i82 += 13;
                    i80 = i37;
                    c6 = 55296;
                }
                charAt24 = i81 | (charAt12 << i82);
                i80 = i37;
            }
            int i83 = charAt24 & 255;
            int i84 = charAt23;
            if ((charAt24 & 1024) != 0) {
                iArr[i74] = i75;
                i74++;
            }
            int[] iArr4 = iArr3;
            if (i83 >= 51) {
                int i85 = i80 + 1;
                int charAt25 = str.charAt(i80);
                char c9 = 55296;
                if (charAt25 >= 55296) {
                    int i86 = charAt25 & 8191;
                    int i87 = 13;
                    while (true) {
                        i36 = i85 + 1;
                        charAt11 = str.charAt(i85);
                        if (charAt11 < c9) {
                            break;
                        }
                        i86 |= (charAt11 & 8191) << i87;
                        i87 += 13;
                        i85 = i36;
                        c9 = 55296;
                    }
                    charAt25 = i86 | (charAt11 << i87);
                    i85 = i36;
                }
                int i88 = i83 - 51;
                int i89 = i85;
                if (i88 != 9 && i88 != 17) {
                    if (i88 == 12) {
                        int a3 = q6.a();
                        if (a3 != 0) {
                            if (a3 == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8 || (charAt24 & 2048) != 0) {
                                i35 = i12 + 1;
                                objArr2[((i75 / 3) * 2) + 1] = objArr3[i12];
                            }
                        } else {
                            throw null;
                        }
                    }
                    int i90 = charAt25 * 2;
                    obj = objArr3[i90];
                    if (!(obj instanceof Field)) {
                        F8 = (Field) obj;
                    } else {
                        F8 = F(cls2, (String) obj);
                        objArr3[i90] = F8;
                    }
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F8);
                    int i91 = i90 + 1;
                    obj2 = objArr3[i91];
                    if (!(obj2 instanceof Field)) {
                        F9 = (Field) obj2;
                    } else {
                        F9 = F(cls2, (String) obj2);
                        objArr3[i91] = F9;
                    }
                    int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F9);
                    int i92 = i10;
                    i26 = objectFieldOffset3;
                    i30 = objectFieldOffset2;
                    i24 = i92;
                    i29 = i12;
                    i27 = i89;
                    i28 = 0;
                    cls = cls2;
                } else {
                    i35 = i12 + 1;
                    objArr2[((i75 / 3) * 2) + 1] = objArr3[i12];
                }
                i12 = i35;
                int i902 = charAt25 * 2;
                obj = objArr3[i902];
                if (!(obj instanceof Field)) {
                }
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(F8);
                int i912 = i902 + 1;
                obj2 = objArr3[i912];
                if (!(obj2 instanceof Field)) {
                }
                int objectFieldOffset32 = (int) unsafe.objectFieldOffset(F9);
                int i922 = i10;
                i26 = objectFieldOffset32;
                i30 = objectFieldOffset22;
                i24 = i922;
                i29 = i12;
                i27 = i89;
                i28 = 0;
                cls = cls2;
            } else {
                int i93 = i12 + 1;
                Field F10 = F(cls2, (String) objArr3[i12]);
                if (i83 == 9 || i83 == 17) {
                    i24 = i10;
                    objArr2[((i75 / 3) * 2) + 1] = F10.getType();
                } else {
                    if (i83 == 27 || i83 == 49) {
                        i24 = i10;
                        i31 = i12 + 2;
                        objArr2[((i75 / 3) * 2) + 1] = objArr3[i93];
                    } else if (i83 != 12 && i83 != 30 && i83 != 44) {
                        if (i83 == 50) {
                            int i94 = i73 + 1;
                            iArr[i73] = i75;
                            int i95 = (i75 / 3) * 2;
                            int i96 = i12 + 2;
                            objArr2[i95] = objArr3[i93];
                            if ((charAt24 & 2048) != 0) {
                                i25 = i12 + 3;
                                objArr2[i95 + 1] = objArr3[i96];
                                i24 = i10;
                                cls = cls2;
                                i73 = i94;
                            } else {
                                cls = cls2;
                                i25 = i96;
                                i73 = i94;
                                i24 = i10;
                            }
                            objectFieldOffset = (int) unsafe.objectFieldOffset(F10);
                            if ((charAt24 & 4096) == 0 && i83 <= 17) {
                                int i97 = i80 + 1;
                                int charAt26 = str.charAt(i80);
                                if (charAt26 >= 55296) {
                                    int i98 = charAt26 & 8191;
                                    int i99 = 13;
                                    while (true) {
                                        i27 = i97 + 1;
                                        charAt10 = str.charAt(i97);
                                        if (charAt10 < 55296) {
                                            break;
                                        }
                                        i98 |= (charAt10 & 8191) << i99;
                                        i99 += 13;
                                        i97 = i27;
                                    }
                                    charAt26 = i98 | (charAt10 << i99);
                                } else {
                                    i27 = i97;
                                }
                                int i100 = (charAt26 / 32) + (i24 * 2);
                                Object obj3 = objArr3[i100];
                                if (obj3 instanceof Field) {
                                    F2 = (Field) obj3;
                                } else {
                                    F2 = F(cls, (String) obj3);
                                    objArr3[i100] = F2;
                                }
                                i26 = (int) unsafe.objectFieldOffset(F2);
                                i28 = charAt26 % 32;
                            } else {
                                i26 = 1048575;
                                i27 = i80;
                                i28 = 0;
                            }
                            if (i83 < 18 && i83 <= 49) {
                                iArr[i72] = objectFieldOffset;
                                i29 = i25;
                                i30 = objectFieldOffset;
                                i72++;
                            } else {
                                i29 = i25;
                                i30 = objectFieldOffset;
                            }
                        } else {
                            i24 = i10;
                        }
                    } else {
                        i24 = i10;
                        if (q6.a() == 1 || (charAt24 & 2048) != 0) {
                            i31 = i12 + 2;
                            objArr2[((i75 / 3) * 2) + 1] = objArr3[i93];
                        }
                    }
                    i25 = i31;
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F10);
                    if ((charAt24 & 4096) == 0) {
                    }
                    i26 = 1048575;
                    i27 = i80;
                    i28 = 0;
                    if (i83 < 18) {
                    }
                    i29 = i25;
                    i30 = objectFieldOffset;
                }
                cls = cls2;
                i25 = i93;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F10);
                if ((charAt24 & 4096) == 0) {
                }
                i26 = 1048575;
                i27 = i80;
                i28 = 0;
                if (i83 < 18) {
                }
                i29 = i25;
                i30 = objectFieldOffset;
            }
            int i101 = i75 + 1;
            iArr4[i75] = i84;
            int i102 = i75 + 2;
            String str2 = str;
            if ((charAt24 & 512) != 0) {
                i32 = 536870912;
            } else {
                i32 = 0;
            }
            int i103 = i32;
            if ((charAt24 & 256) != 0) {
                i33 = 268435456;
            } else {
                i33 = 0;
            }
            int i104 = i103 | i33;
            if ((charAt24 & 2048) != 0) {
                i34 = Integer.MIN_VALUE;
            } else {
                i34 = 0;
            }
            iArr4[i101] = i104 | i34 | (i83 << 20) | i30;
            i75 += 3;
            iArr4[i102] = (i28 << 20) | i26;
            cls2 = cls;
            objArr = objArr3;
            str = str2;
            length = i22;
            i10 = i24;
            i42 = i27;
            i40 = 55296;
            i12 = i29;
            iArr3 = iArr4;
        }
        return new J(iArr3, objArr2, i8, i11, q6.f8633a, iArr, i13, i71, l6, c0488y, y4, c0478n, f8);
    }

    public static long x(int i4) {
        return i4 & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) f0.f8676c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) f0.f8676c.h(j, obj)).longValue();
    }

    public final int A(int i4) {
        if (i4 >= this.f8613c && i4 <= this.f8614d) {
            int[] iArr = this.f8611a;
            int length = (iArr.length / 3) - 1;
            int i8 = 0;
            while (i8 <= length) {
                int i9 = (length + i8) >>> 1;
                int i10 = i9 * 3;
                int i11 = iArr[i10];
                if (i4 == i11) {
                    return i10;
                }
                if (i4 < i11) {
                    length = i9 - 1;
                } else {
                    i8 = i9 + 1;
                }
            }
        }
        return -1;
    }

    public final void B(Object obj, long j, C0474j c0474j, S s8, C0477m c0477m) {
        int u8;
        this.k.getClass();
        InterfaceC0485v a3 = C0488y.a(j, obj);
        b8.c cVar = c0474j.f8701a;
        int i4 = c0474j.f8702b;
        if ((i4 & 7) != 3) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            AbstractC0484u i8 = s8.i();
            c0474j.b(i8, s8, c0477m);
            s8.d(i8);
            ((P) a3).add(i8);
            if (!cVar.c() && c0474j.f8704d == 0) {
                u8 = cVar.u();
            } else {
                return;
            }
        } while (u8 == i4);
        c0474j.f8704d = u8;
    }

    public final void C(Object obj, int i4, C0474j c0474j, S s8, C0477m c0477m) {
        int u8;
        this.k.getClass();
        InterfaceC0485v a3 = C0488y.a(i4 & 1048575, obj);
        b8.c cVar = c0474j.f8701a;
        int i8 = c0474j.f8702b;
        if ((i8 & 7) != 2) {
            throw InvalidProtocolBufferException.b();
        }
        do {
            AbstractC0484u i9 = s8.i();
            c0474j.c(i9, s8, c0477m);
            s8.d(i9);
            ((P) a3).add(i9);
            if (!cVar.c() && c0474j.f8704d == 0) {
                u8 = cVar.u();
            } else {
                return;
            }
        } while (u8 == i8);
        c0474j.f8704d = u8;
    }

    public final void D(int i4, C0474j c0474j, Object obj) {
        if ((536870912 & i4) != 0) {
            c0474j.w(2);
            f0.o(obj, i4 & 1048575, c0474j.f8701a.t());
        } else if (this.f8616f) {
            c0474j.w(2);
            f0.o(obj, i4 & 1048575, c0474j.f8701a.s());
        } else {
            f0.o(obj, i4 & 1048575, c0474j.e());
        }
    }

    public final void E(int i4, C0474j c0474j, Object obj) {
        int i8 = 536870912 & i4;
        C0488y c0488y = this.k;
        if (i8 != 0) {
            c0488y.getClass();
            c0474j.s(C0488y.a(i4 & 1048575, obj), true);
        } else {
            c0488y.getClass();
            c0474j.s(C0488y.a(i4 & 1048575, obj), false);
        }
    }

    public final void G(int i4, Object obj) {
        int i8 = this.f8611a[i4 + 2];
        long j = 1048575 & i8;
        if (j == 1048575) {
            return;
        }
        f0.m((1 << (i8 >>> 20)) | f0.f8676c.f(j, obj), j, obj);
    }

    public final void H(Object obj, int i4, int i8) {
        f0.m(i4, this.f8611a[i8 + 2] & 1048575, obj);
    }

    public final void I(Object obj, int i4, AbstractC0465a abstractC0465a) {
        f8610o.putObject(obj, L(i4) & 1048575, abstractC0465a);
        G(i4, obj);
    }

    public final void J(Object obj, int i4, int i8, AbstractC0465a abstractC0465a) {
        f8610o.putObject(obj, L(i8) & 1048575, abstractC0465a);
        H(obj, i4, i8);
    }

    public final int L(int i4) {
        return this.f8611a[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0045. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x0249. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:91:0x033d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Object obj, B b4) {
        int i4;
        int i8;
        B b9;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z8;
        int Y;
        int size;
        int X8;
        int a3;
        int X9;
        int Y2;
        int size2;
        int X10;
        J j = this;
        B b10 = b4;
        int[] iArr = j.f8611a;
        int length = iArr.length;
        Unsafe unsafe = f8610o;
        int i13 = 1048575;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        while (i15 < length) {
            int L8 = j.L(i15);
            int i17 = iArr[i15];
            int K = K(L8);
            int i18 = 1;
            if (K <= 17) {
                int i19 = iArr[i15 + 2];
                int i20 = i19 & i13;
                if (i20 != i14) {
                    if (i20 == i13) {
                        i16 = 0;
                    } else {
                        i16 = unsafe.getInt(obj, i20);
                    }
                    i14 = i20;
                }
                i4 = L8;
                i8 = 1 << (i19 >>> 20);
            } else {
                i4 = L8;
                i8 = 0;
            }
            long j5 = i4 & i13;
            switch (K) {
                case 0:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        double d2 = f0.f8676c.d(j5, obj);
                        C0475k c0475k = (C0475k) b9.f8597a;
                        c0475k.getClass();
                        c0475k.i0(i17, Double.doubleToRawLongBits(d2));
                    }
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 1:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        float e9 = f0.f8676c.e(j5, obj);
                        C0475k c0475k2 = (C0475k) b9.f8597a;
                        c0475k2.getClass();
                        c0475k2.g0(i17, Float.floatToRawIntBits(e9));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).s0(i17, unsafe.getLong(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).s0(i17, unsafe.getLong(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).k0(i17, unsafe.getInt(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).i0(i17, unsafe.getLong(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).g0(i17, unsafe.getInt(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).d0(i17, f0.f8676c.c(j5, obj));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        Object object = unsafe.getObject(obj, j5);
                        if (object instanceof String) {
                            ((C0475k) b9.f8597a).n0((String) object, i17);
                        } else {
                            ((C0475k) b9.f8597a).e0(i17, (C0471g) object);
                        }
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 9:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).m0(i17, (AbstractC0465a) unsafe.getObject(obj, j5), j.m(i15));
                    }
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 10:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).e0(i17, (C0471g) unsafe.getObject(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 11:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).q0(i17, unsafe.getInt(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 12:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).k0(i17, unsafe.getInt(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 13:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).g0(i17, unsafe.getInt(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 14:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        ((C0475k) b9.f8597a).i0(i17, unsafe.getLong(obj, j5));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 15:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        int i21 = unsafe.getInt(obj, j5);
                        ((C0475k) b9.f8597a).q0(i17, (i21 >> 31) ^ (i21 << 1));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 16:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        long j8 = unsafe.getLong(obj, j5);
                        ((C0475k) b9.f8597a).s0(i17, (j8 >> 63) ^ (j8 << 1));
                    }
                    j = this;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 17:
                    b9 = b10;
                    if (j.o(obj, i15, i14, i16, i8)) {
                        b9.a(i17, unsafe.getObject(obj, j5), j.m(i15));
                    }
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 18:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.n(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 19:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.r(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 20:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.t(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 21:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.z(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 22:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.s(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 23:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.q(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 24:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.p(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 25:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    T.m(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 26:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    int i22 = iArr[i15];
                    List list = (List) unsafe.getObject(obj, j5);
                    Class cls = T.f8637a;
                    if (list != null && !list.isEmpty()) {
                        b9.getClass();
                        for (int i23 = 0; i23 < list.size(); i23++) {
                            ((C0475k) b9.f8597a).n0((String) list.get(i23), i22);
                        }
                    }
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                    break;
                case 27:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    int i24 = iArr[i15];
                    List list2 = (List) unsafe.getObject(obj, j5);
                    S m6 = j.m(i15);
                    Class cls2 = T.f8637a;
                    if (list2 != null && !list2.isEmpty()) {
                        b9.getClass();
                        for (int i25 = 0; i25 < list2.size(); i25++) {
                            ((C0475k) b9.f8597a).m0(i24, (AbstractC0465a) list2.get(i25), m6);
                        }
                    }
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                    break;
                case 28:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    int i26 = iArr[i15];
                    List list3 = (List) unsafe.getObject(obj, j5);
                    Class cls3 = T.f8637a;
                    if (list3 != null && !list3.isEmpty()) {
                        b9.getClass();
                        for (int i27 = 0; i27 < list3.size(); i27++) {
                            ((C0475k) b9.f8597a).e0(i26, (C0471g) list3.get(i27));
                        }
                    }
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                    break;
                case 29:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.y(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 30:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.o(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 31:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.u(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 32:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.v(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 33:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.w(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 34:
                    i9 = i14;
                    i10 = i16;
                    b9 = b10;
                    z8 = false;
                    T.x(iArr[i15], (List) unsafe.getObject(obj, j5), b9, false);
                    i14 = i9;
                    i16 = i10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 35:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.n(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 36:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.r(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 37:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.t(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 38:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.z(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 39:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.s(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 40:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.q(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 41:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.p(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 42:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.m(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 43:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.y(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 44:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.o(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 45:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.u(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 46:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.v(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 47:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.w(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 48:
                    i11 = i14;
                    i12 = i16;
                    b9 = b10;
                    T.x(iArr[i15], (List) unsafe.getObject(obj, j5), b9, true);
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 49:
                    i11 = i14;
                    i12 = i16;
                    int i28 = iArr[i15];
                    List list4 = (List) unsafe.getObject(obj, j5);
                    S m8 = j.m(i15);
                    Class cls4 = T.f8637a;
                    if (list4 != null && !list4.isEmpty()) {
                        b4.getClass();
                        for (int i29 = 0; i29 < list4.size(); i29++) {
                            b4.a(i28, list4.get(i29), m8);
                        }
                    }
                    b9 = b4;
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j5);
                    if (object2 != null) {
                        int i30 = 2;
                        Object obj2 = j.f8612b[(i15 / 3) * 2];
                        j.f8621m.getClass();
                        C c6 = ((D) obj2).f8601a;
                        n0 n0Var = c6.f8599b;
                        n0 n0Var2 = c6.f8598a;
                        C0475k c0475k3 = (C0475k) b10.f8597a;
                        c0475k3.getClass();
                        Iterator it = ((E) object2).entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            c0475k3.p0(i17, i30);
                            int i31 = i30;
                            Object key = entry.getKey();
                            int i32 = i18;
                            Object value = entry.getValue();
                            int i33 = C0480p.f8730c;
                            int W7 = C0475k.W(i32);
                            int i34 = i14;
                            k0 k0Var = n0.f8714g;
                            if (n0Var2 == k0Var) {
                                W7 *= 2;
                            }
                            int i35 = i16;
                            Iterator it2 = it;
                            switch (n0Var2.ordinal()) {
                                case 0:
                                    ((Double) key).getClass();
                                    Y = 8;
                                    int i36 = Y + W7;
                                    int W8 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                        W8 *= 2;
                                    }
                                    switch (n0Var.ordinal()) {
                                        case 0:
                                            ((Double) value).getClass();
                                            Y2 = 8;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2 = entry.getKey();
                                            Object value2 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2);
                                            C0480p.b(c0475k3, n0Var, i31, value2);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 1:
                                            ((Float) value).getClass();
                                            Y2 = 4;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22 = entry.getKey();
                                            Object value22 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22);
                                            C0480p.b(c0475k3, n0Var, i31, value22);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                            Y2 = C0475k.Y(((Long) value).longValue());
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key222 = entry.getKey();
                                            Object value222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key222);
                                            C0480p.b(c0475k3, n0Var, i31, value222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                            Y2 = C0475k.Y(((Long) value).longValue());
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2222 = entry.getKey();
                                            Object value2222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2222);
                                            C0480p.b(c0475k3, n0Var, i31, value2222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                            Y2 = C0475k.Y(((Integer) value).intValue());
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22222 = entry.getKey();
                                            Object value22222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22222);
                                            C0480p.b(c0475k3, n0Var, i31, value22222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                            ((Long) value).getClass();
                                            Y2 = 8;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key222222 = entry.getKey();
                                            Object value222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key222222);
                                            C0480p.b(c0475k3, n0Var, i31, value222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                            ((Integer) value).getClass();
                                            Y2 = 4;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2222222 = entry.getKey();
                                            Object value2222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2222222);
                                            C0480p.b(c0475k3, n0Var, i31, value2222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                            ((Boolean) value).getClass();
                                            Y2 = i32;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22222222 = entry.getKey();
                                            Object value22222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22222222);
                                            C0480p.b(c0475k3, n0Var, i31, value22222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                            if (value instanceof C0471g) {
                                                size2 = ((C0471g) value).size();
                                                X10 = C0475k.X(size2);
                                                Y2 = size2 + X10;
                                                c0475k3.r0(Y2 + W8 + i36);
                                                Object key222222222 = entry.getKey();
                                                Object value222222222 = entry.getValue();
                                                C0480p.b(c0475k3, n0Var2, i32, key222222222);
                                                C0480p.b(c0475k3, n0Var, i31, value222222222);
                                                i30 = i31;
                                                i14 = i34;
                                                i16 = i35;
                                                it = it2;
                                                i18 = 1;
                                            } else {
                                                Y2 = C0475k.V((String) value);
                                                c0475k3.r0(Y2 + W8 + i36);
                                                Object key2222222222 = entry.getKey();
                                                Object value2222222222 = entry.getValue();
                                                C0480p.b(c0475k3, n0Var2, i32, key2222222222);
                                                C0480p.b(c0475k3, n0Var, i31, value2222222222);
                                                i30 = i31;
                                                i14 = i34;
                                                i16 = i35;
                                                it = it2;
                                                i18 = 1;
                                            }
                                        case 9:
                                            Y2 = ((AbstractC0484u) ((AbstractC0465a) value)).a(null);
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22222222222 = entry.getKey();
                                            Object value22222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value22222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 10:
                                            size2 = ((AbstractC0484u) ((AbstractC0465a) value)).a(null);
                                            X10 = C0475k.X(size2);
                                            Y2 = size2 + X10;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key222222222222 = entry.getKey();
                                            Object value222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 11:
                                            if (value instanceof C0471g) {
                                                size2 = ((C0471g) value).size();
                                                X10 = C0475k.X(size2);
                                            } else {
                                                size2 = ((byte[]) value).length;
                                                X10 = C0475k.X(size2);
                                            }
                                            Y2 = size2 + X10;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2222222222222 = entry.getKey();
                                            Object value2222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value2222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 12:
                                            Y2 = C0475k.X(((Integer) value).intValue());
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22222222222222 = entry.getKey();
                                            Object value22222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value22222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 13:
                                            Y2 = C0475k.Y(((Integer) value).intValue());
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key222222222222222 = entry.getKey();
                                            Object value222222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key222222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value222222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 14:
                                            ((Integer) value).getClass();
                                            Y2 = 4;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2222222222222222 = entry.getKey();
                                            Object value2222222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2222222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value2222222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 15:
                                            ((Long) value).getClass();
                                            Y2 = 8;
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key22222222222222222 = entry.getKey();
                                            Object value22222222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key22222222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value22222222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 16:
                                            int intValue = ((Integer) value).intValue();
                                            Y2 = C0475k.X((intValue >> 31) ^ (intValue << 1));
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key222222222222222222 = entry.getKey();
                                            Object value222222222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key222222222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value222222222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        case 17:
                                            long longValue = ((Long) value).longValue();
                                            Y2 = C0475k.Y((longValue << i32) ^ (longValue >> 63));
                                            c0475k3.r0(Y2 + W8 + i36);
                                            Object key2222222222222222222 = entry.getKey();
                                            Object value2222222222222222222 = entry.getValue();
                                            C0480p.b(c0475k3, n0Var2, i32, key2222222222222222222);
                                            C0480p.b(c0475k3, n0Var, i31, value2222222222222222222);
                                            i30 = i31;
                                            i14 = i34;
                                            i16 = i35;
                                            it = it2;
                                            i18 = 1;
                                        default:
                                            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                    }
                                case 1:
                                    ((Float) key).getClass();
                                    Y = 4;
                                    int i362 = Y + W7;
                                    int W82 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                    Y = C0475k.Y(((Long) key).longValue());
                                    int i3622 = Y + W7;
                                    int W822 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                    Y = C0475k.Y(((Long) key).longValue());
                                    int i36222 = Y + W7;
                                    int W8222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                    Y = C0475k.Y(((Integer) key).intValue());
                                    int i362222 = Y + W7;
                                    int W82222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                    ((Long) key).getClass();
                                    Y = 8;
                                    int i3622222 = Y + W7;
                                    int W822222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                    ((Integer) key).getClass();
                                    Y = 4;
                                    int i36222222 = Y + W7;
                                    int W8222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                    ((Boolean) key).getClass();
                                    Y = i32;
                                    int i362222222 = Y + W7;
                                    int W82222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                    if (key instanceof C0471g) {
                                        size = ((C0471g) key).size();
                                        X8 = C0475k.X(size);
                                        Y = size + X8;
                                        int i3622222222 = Y + W7;
                                        int W822222222 = C0475k.W(i31);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    } else {
                                        Y = C0475k.V((String) key);
                                        int i36222222222 = Y + W7;
                                        int W8222222222 = C0475k.W(i31);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    }
                                case 9:
                                    a3 = ((AbstractC0484u) ((AbstractC0465a) key)).a(null);
                                    Y = a3;
                                    int i362222222222 = Y + W7;
                                    int W82222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 10:
                                    int a4 = ((AbstractC0484u) ((AbstractC0465a) key)).a(null);
                                    a3 = a4 + C0475k.X(a4);
                                    Y = a3;
                                    int i3622222222222 = Y + W7;
                                    int W822222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 11:
                                    if (key instanceof C0471g) {
                                        size = ((C0471g) key).size();
                                        X8 = C0475k.X(size);
                                    } else {
                                        size = ((byte[]) key).length;
                                        X8 = C0475k.X(size);
                                    }
                                    Y = size + X8;
                                    int i36222222222222 = Y + W7;
                                    int W8222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 12:
                                    Y = C0475k.X(((Integer) key).intValue());
                                    int i362222222222222 = Y + W7;
                                    int W82222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 13:
                                    Y = C0475k.Y(((Integer) key).intValue());
                                    int i3622222222222222 = Y + W7;
                                    int W822222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 14:
                                    ((Integer) key).getClass();
                                    Y = 4;
                                    int i36222222222222222 = Y + W7;
                                    int W8222222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 15:
                                    ((Long) key).getClass();
                                    Y = 8;
                                    int i362222222222222222 = Y + W7;
                                    int W82222222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 16:
                                    int intValue2 = ((Integer) key).intValue();
                                    X9 = C0475k.X((intValue2 << 1) ^ (intValue2 >> 31));
                                    Y = X9;
                                    int i3622222222222222222 = Y + W7;
                                    int W822222222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                case 17:
                                    long longValue2 = ((Long) key).longValue();
                                    X9 = C0475k.Y((longValue2 << i32) ^ (longValue2 >> 63));
                                    Y = X9;
                                    int i36222222222222222222 = Y + W7;
                                    int W8222222222222222222 = C0475k.W(i31);
                                    if (n0Var == k0Var) {
                                    }
                                    switch (n0Var.ordinal()) {
                                    }
                                default:
                                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                            }
                        }
                    }
                    i11 = i14;
                    i12 = i16;
                    b9 = b4;
                    i14 = i11;
                    i16 = i12;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 51:
                    if (j.q(obj, i17, i15)) {
                        double doubleValue = ((Double) f0.f8676c.h(j5, obj)).doubleValue();
                        C0475k c0475k4 = (C0475k) b10.f8597a;
                        c0475k4.getClass();
                        c0475k4.i0(i17, Double.doubleToRawLongBits(doubleValue));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 52:
                    if (j.q(obj, i17, i15)) {
                        float floatValue = ((Float) f0.f8676c.h(j5, obj)).floatValue();
                        C0475k c0475k5 = (C0475k) b10.f8597a;
                        c0475k5.getClass();
                        c0475k5.g0(i17, Float.floatToRawIntBits(floatValue));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 53:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).s0(i17, z(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 54:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).s0(i17, z(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 55:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).k0(i17, y(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 56:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).i0(i17, z(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 57:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).g0(i17, y(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 58:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).d0(i17, ((Boolean) f0.f8676c.h(j5, obj)).booleanValue());
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 59:
                    if (j.q(obj, i17, i15)) {
                        Object object3 = unsafe.getObject(obj, j5);
                        if (object3 instanceof String) {
                            ((C0475k) b10.f8597a).n0((String) object3, i17);
                        } else {
                            ((C0475k) b10.f8597a).e0(i17, (C0471g) object3);
                        }
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 60:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).m0(i17, (AbstractC0465a) unsafe.getObject(obj, j5), j.m(i15));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 61:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).e0(i17, (C0471g) unsafe.getObject(obj, j5));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 62:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).q0(i17, y(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 63:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).k0(i17, y(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 64:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).g0(i17, y(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 65:
                    if (j.q(obj, i17, i15)) {
                        ((C0475k) b10.f8597a).i0(i17, z(j5, obj));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 66:
                    if (j.q(obj, i17, i15)) {
                        int y4 = y(j5, obj);
                        ((C0475k) b10.f8597a).q0(i17, (y4 >> 31) ^ (y4 << 1));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 67:
                    if (j.q(obj, i17, i15)) {
                        long z9 = z(j5, obj);
                        ((C0475k) b10.f8597a).s0(i17, (z9 << 1) ^ (z9 >> 63));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                case 68:
                    if (j.q(obj, i17, i15)) {
                        b10.a(i17, unsafe.getObject(obj, j5), j.m(i15));
                    }
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
                default:
                    b9 = b10;
                    i15 += 3;
                    b10 = b9;
                    i13 = 1048575;
            }
        }
        ((a0) j.f8620l).getClass();
        ((AbstractC0484u) obj).unknownFields.d(b10);
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (p(obj)) {
            obj2.getClass();
            int i4 = 0;
            while (true) {
                int[] iArr = this.f8611a;
                if (i4 < iArr.length) {
                    int L8 = L(i4);
                    long j = 1048575 & L8;
                    int i8 = iArr[i4];
                    switch (K(L8)) {
                        case 0:
                            if (n(i4, obj2)) {
                                e0 e0Var = f0.f8676c;
                                obj3 = obj;
                                e0Var.l(obj3, j, e0Var.d(j, obj2));
                                G(i4, obj3);
                                break;
                            }
                            break;
                        case 1:
                            if (n(i4, obj2)) {
                                e0 e0Var2 = f0.f8676c;
                                e0Var2.m(obj, j, e0Var2.e(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            if (n(i4, obj2)) {
                                f0.n(obj, j, f0.f8676c.g(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            if (n(i4, obj2)) {
                                f0.n(obj, j, f0.f8676c.g(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            if (n(i4, obj2)) {
                                f0.n(obj, j, f0.f8676c.g(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (n(i4, obj2)) {
                                e0 e0Var3 = f0.f8676c;
                                e0Var3.j(obj, j, e0Var3.c(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            if (n(i4, obj2)) {
                                f0.o(obj, j, f0.f8676c.h(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 9:
                            s(obj, i4, obj2);
                            break;
                        case 10:
                            if (n(i4, obj2)) {
                                f0.o(obj, j, f0.f8676c.h(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 11:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 12:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 13:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 14:
                            if (n(i4, obj2)) {
                                f0.n(obj, j, f0.f8676c.g(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 15:
                            if (n(i4, obj2)) {
                                f0.m(f0.f8676c.f(j, obj2), j, obj);
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 16:
                            if (n(i4, obj2)) {
                                f0.n(obj, j, f0.f8676c.g(j, obj2));
                                G(i4, obj);
                                break;
                            }
                            break;
                        case 17:
                            s(obj, i4, obj2);
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.k.getClass();
                            e0 e0Var4 = f0.f8676c;
                            InterfaceC0485v interfaceC0485v = (InterfaceC0485v) e0Var4.h(j, obj);
                            InterfaceC0485v interfaceC0485v2 = (InterfaceC0485v) e0Var4.h(j, obj2);
                            P p8 = (P) interfaceC0485v;
                            int i9 = p8.f8632f;
                            int i10 = ((P) interfaceC0485v2).f8632f;
                            if (i9 > 0 && i10 > 0) {
                                if (!((AbstractC0466b) interfaceC0485v).f8662d) {
                                    interfaceC0485v = p8.i(i10 + i9);
                                }
                                ((AbstractC0466b) interfaceC0485v).addAll(interfaceC0485v2);
                            }
                            if (i9 > 0) {
                                interfaceC0485v2 = interfaceC0485v;
                            }
                            f0.o(obj, j, interfaceC0485v2);
                            break;
                        case 50:
                            Class cls = T.f8637a;
                            e0 e0Var5 = f0.f8676c;
                            Object h8 = e0Var5.h(j, obj);
                            Object h9 = e0Var5.h(j, obj2);
                            this.f8621m.getClass();
                            f0.o(obj, j, F.a(h8, h9));
                            break;
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                            if (q(obj2, i8, i4)) {
                                f0.o(obj, j, f0.f8676c.h(j, obj2));
                                H(obj, i8, i4);
                                break;
                            }
                            break;
                        case 60:
                            t(obj, i4, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                            if (q(obj2, i8, i4)) {
                                f0.o(obj, j, f0.f8676c.h(j, obj2));
                                H(obj, i8, i4);
                                break;
                            }
                            break;
                        case 68:
                            t(obj, i4, obj2);
                            break;
                    }
                    obj3 = obj;
                    i4 += 3;
                    obj = obj3;
                } else {
                    T.k(this.f8620l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void b(Object obj, B b4) {
        b4.getClass();
        M(obj, b4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001c. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(AbstractC0484u abstractC0484u) {
        int i4;
        int b4;
        int i8;
        int[] iArr = this.f8611a;
        int length = iArr.length;
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int L8 = L(i10);
            int i11 = iArr[i10];
            long j = 1048575 & L8;
            int i12 = 1237;
            int i13 = 37;
            switch (K(L8)) {
                case 0:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(Double.doubleToLongBits(f0.f8676c.d(j, abstractC0484u)));
                    i9 = b4 + i4;
                    break;
                case 1:
                    i4 = i9 * 53;
                    b4 = Float.floatToIntBits(f0.f8676c.e(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(f0.f8676c.g(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(f0.f8676c.g(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(f0.f8676c.g(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    i8 = i9 * 53;
                    boolean c6 = f0.f8676c.c(j, abstractC0484u);
                    Charset charset = AbstractC0486w.f8742a;
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    i4 = i9 * 53;
                    b4 = ((String) f0.f8676c.h(j, abstractC0484u)).hashCode();
                    i9 = b4 + i4;
                    break;
                case 9:
                    Object h8 = f0.f8676c.h(j, abstractC0484u);
                    if (h8 != null) {
                        i13 = h8.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 10:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                    i9 = b4 + i4;
                    break;
                case 11:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case 12:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case 13:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case 14:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(f0.f8676c.g(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case 15:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.f(j, abstractC0484u);
                    i9 = b4 + i4;
                    break;
                case 16:
                    i4 = i9 * 53;
                    b4 = AbstractC0486w.b(f0.f8676c.g(j, abstractC0484u));
                    i9 = b4 + i4;
                    break;
                case 17:
                    Object h9 = f0.f8676c.h(j, abstractC0484u);
                    if (h9 != null) {
                        i13 = h9.hashCode();
                    }
                    i9 = (i9 * 53) + i13;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                    i9 = b4 + i4;
                    break;
                case 50:
                    i4 = i9 * 53;
                    b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                    i9 = b4 + i4;
                    break;
                case 51:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(Double.doubleToLongBits(((Double) f0.f8676c.h(j, abstractC0484u)).doubleValue()));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = Float.floatToIntBits(((Float) f0.f8676c.h(j, abstractC0484u)).floatValue());
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(z(j, abstractC0484u));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(z(j, abstractC0484u));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(z(j, abstractC0484u));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(abstractC0484u, i11, i10)) {
                        i8 = i9 * 53;
                        boolean booleanValue = ((Boolean) f0.f8676c.h(j, abstractC0484u)).booleanValue();
                        Charset charset2 = AbstractC0486w.f8742a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = ((String) f0.f8676c.h(j, abstractC0484u)).hashCode();
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(z(j, abstractC0484u));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = y(j, abstractC0484u);
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = AbstractC0486w.b(z(j, abstractC0484u));
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(abstractC0484u, i11, i10)) {
                        i4 = i9 * 53;
                        b4 = f0.f8676c.h(j, abstractC0484u).hashCode();
                        i9 = b4 + i4;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((a0) this.f8620l).getClass();
        return abstractC0484u.unknownFields.hashCode() + (i9 * 53);
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final void d(Object obj) {
        if (p(obj)) {
            if (obj instanceof AbstractC0484u) {
                AbstractC0484u abstractC0484u = (AbstractC0484u) obj;
                abstractC0484u.k(Integer.MAX_VALUE);
                abstractC0484u.memoizedHashCode = 0;
                abstractC0484u.h();
            }
            int[] iArr = this.f8611a;
            int length = iArr.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int L8 = L(i4);
                long j = 1048575 & L8;
                int K = K(L8);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.k.getClass();
                                AbstractC0466b abstractC0466b = (AbstractC0466b) ((InterfaceC0485v) f0.f8676c.h(j, obj));
                                if (abstractC0466b.f8662d) {
                                    abstractC0466b.f8662d = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = f8610o;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.f8621m.getClass();
                                    ((E) object).f8604d = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(obj, iArr[i4], i4)) {
                        m(i4).d(f8610o.getObject(obj, j));
                    }
                }
                if (n(i4, obj)) {
                    m(i4).d(f8610o.getObject(obj, j));
                }
            }
            ((a0) this.f8620l).getClass();
            Z z8 = ((AbstractC0484u) obj).unknownFields;
            if (z8.f8661e) {
                z8.f8661e = false;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final boolean e(Object obj) {
        int i4;
        int i8;
        int i9;
        int i10 = 1048575;
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f8618h) {
            int i13 = this.f8617g[i12];
            int[] iArr = this.f8611a;
            int i14 = iArr[i13];
            int L8 = L(i13);
            int i15 = iArr[i13 + 2];
            int i16 = i15 & 1048575;
            int i17 = 1 << (i15 >>> 20);
            if (i16 != i10) {
                if (i16 != 1048575) {
                    i11 = f8610o.getInt(obj, i16);
                }
                i8 = i13;
                i9 = i11;
                i4 = i16;
            } else {
                int i18 = i11;
                i4 = i10;
                i8 = i13;
                i9 = i18;
            }
            if ((268435456 & L8) == 0 || o(obj, i8, i4, i9, i17)) {
                int K = K(L8);
                if (K != 9 && K != 17) {
                    if (K != 27) {
                        if (K != 60 && K != 68) {
                            if (K != 49) {
                                if (K != 50) {
                                    continue;
                                } else {
                                    Object h8 = f0.f8676c.h(L8 & 1048575, obj);
                                    this.f8621m.getClass();
                                    E e9 = (E) h8;
                                    if (e9.isEmpty()) {
                                        continue;
                                    } else {
                                        if (((D) this.f8612b[(i8 / 3) * 2]).f8601a.f8599b.f8717d != o0.MESSAGE) {
                                            continue;
                                        } else {
                                            S s8 = null;
                                            for (Object obj2 : e9.values()) {
                                                if (s8 == null) {
                                                    s8 = O.f8627c.a(obj2.getClass());
                                                }
                                                if (!s8.e(obj2)) {
                                                }
                                            }
                                        }
                                    }
                                }
                                i12++;
                                i10 = i4;
                                i11 = i9;
                            }
                        } else {
                            if (q(obj, i14, i8)) {
                                if (!m(i8).e(f0.f8676c.h(L8 & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i12++;
                            i10 = i4;
                            i11 = i9;
                        }
                    }
                    List list = (List) f0.f8676c.h(L8 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        S m6 = m(i8);
                        for (int i19 = 0; i19 < list.size(); i19++) {
                            if (m6.e(list.get(i19))) {
                            }
                        }
                    }
                    i12++;
                    i10 = i4;
                    i11 = i9;
                } else {
                    if (o(obj, i8, i4, i9, i17)) {
                        if (!m(i8).e(f0.f8676c.h(L8 & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i12++;
                    i10 = i4;
                    i11 = i9;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.T.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.T.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.T.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.T.l(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.T.l(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    @Override // androidx.datastore.preferences.protobuf.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(AbstractC0484u abstractC0484u, AbstractC0484u abstractC0484u2) {
        int[] iArr = this.f8611a;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            boolean z8 = true;
            if (i4 < length) {
                int L8 = L(i4);
                long j = L8 & 1048575;
                switch (K(L8)) {
                    case 0:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 1:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var2 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var3 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var4 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var5 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var6 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var7 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var8 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var9 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 9:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var10 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 10:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var11 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 11:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var12 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 12:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var13 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 13:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var14 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 14:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var15 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 15:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var16 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 16:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var17 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 17:
                        if (j(abstractC0484u, abstractC0484u2, i4)) {
                            e0 e0Var18 = f0.f8676c;
                            break;
                        }
                        z8 = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        e0 e0Var19 = f0.f8676c;
                        z8 = T.l(e0Var19.h(j, abstractC0484u), e0Var19.h(j, abstractC0484u2));
                        break;
                    case 50:
                        e0 e0Var20 = f0.f8676c;
                        z8 = T.l(e0Var20.h(j, abstractC0484u), e0Var20.h(j, abstractC0484u2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j5 = iArr[i4 + 2] & 1048575;
                        e0 e0Var21 = f0.f8676c;
                        if (e0Var21.f(j5, abstractC0484u) == e0Var21.f(j5, abstractC0484u2)) {
                            break;
                        }
                        z8 = false;
                        break;
                }
                if (z8) {
                    i4 += 3;
                }
            } else {
                a0 a0Var = (a0) this.f8620l;
                a0Var.getClass();
                Z z9 = abstractC0484u.unknownFields;
                a0Var.getClass();
                if (z9.equals(abstractC0484u2.unknownFields)) {
                    return true;
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // androidx.datastore.preferences.protobuf.S
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.C0474j r20, androidx.datastore.preferences.protobuf.C0477m r21) {
        /*
            Method dump skipped, instructions count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.J.g(java.lang.Object, androidx.datastore.preferences.protobuf.j, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:117:0x021c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:124:0x0323. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x004e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:122:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0326 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(AbstractC0484u abstractC0484u) {
        int i4;
        int W7;
        int W8;
        int W9;
        int Y;
        int W10;
        int Y2;
        int W11;
        int W12;
        int V6;
        int U8;
        int a3;
        int i8;
        int c6;
        int i9;
        int i10;
        int W13;
        int size;
        int i11;
        int W14;
        int W15;
        int W16;
        int size2;
        int W17;
        int X8;
        int i12;
        int i13;
        Iterator it;
        int Y8;
        int size3;
        int X9;
        n0 n0Var;
        int Y9;
        int size4;
        int X10;
        int W18;
        int W19;
        int Y10;
        int W20;
        int Y11;
        int V8;
        int X11;
        J j = this;
        AbstractC0484u abstractC0484u2 = abstractC0484u;
        Unsafe unsafe = f8610o;
        int i14 = 1048575;
        int i15 = 1048575;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int[] iArr = j.f8611a;
            if (i16 < iArr.length) {
                int L8 = j.L(i16);
                int K = K(L8);
                int i19 = iArr[i16];
                int i20 = iArr[i16 + 2];
                int i21 = i20 & i14;
                int i22 = 1;
                if (K <= 17) {
                    if (i21 != i15) {
                        if (i21 == i14) {
                            i17 = 0;
                        } else {
                            i17 = unsafe.getInt(abstractC0484u2, i21);
                        }
                        i15 = i21;
                    }
                    i4 = 1 << (i20 >>> 20);
                } else {
                    i4 = 0;
                }
                long j5 = L8 & i14;
                if (K >= EnumC0481q.f8733e.f8737d) {
                    int i23 = EnumC0481q.f8734f.f8737d;
                }
                char c9 = '?';
                switch (K) {
                    case 0:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W7 = C0475k.W(i19);
                            a3 = W7 + 8;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 1:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W8 = C0475k.W(i19);
                            W12 = W8 + 4;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            long j8 = unsafe.getLong(abstractC0484u2, j5);
                            W9 = C0475k.W(i19);
                            Y = C0475k.Y(j8);
                            i18 += Y + W9;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            long j9 = unsafe.getLong(abstractC0484u2, j5);
                            W9 = C0475k.W(i19);
                            Y = C0475k.Y(j9);
                            i18 += Y + W9;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            int i24 = unsafe.getInt(abstractC0484u2, j5);
                            W10 = C0475k.W(i19);
                            Y2 = C0475k.Y(i24);
                            U8 = Y2 + W10;
                            i18 += U8;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W11 = C0475k.W(i19);
                            W12 = W11 + 8;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W8 = C0475k.W(i19);
                            W12 = W8 + 4;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W12 = C0475k.W(i19) + 1;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            Object object = unsafe.getObject(abstractC0484u2, j5);
                            if (object instanceof C0471g) {
                                V6 = C0475k.U(i19, (C0471g) object);
                            } else {
                                V6 = C0475k.V((String) object) + C0475k.W(i19);
                            }
                            i18 = V6 + i18;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 9:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            Object object2 = unsafe.getObject(abstractC0484u2, j5);
                            S m6 = j.m(i16);
                            Class cls = T.f8637a;
                            int W21 = C0475k.W(i19);
                            int a4 = ((AbstractC0465a) object2).a(m6);
                            i18 += C0475k.X(a4) + a4 + W21;
                        }
                        i16 += 3;
                        i14 = 1048575;
                    case 10:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            U8 = C0475k.U(i19, (C0471g) unsafe.getObject(abstractC0484u2, j5));
                            i18 += U8;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 11:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            int i25 = unsafe.getInt(abstractC0484u2, j5);
                            W10 = C0475k.W(i19);
                            Y2 = C0475k.X(i25);
                            U8 = Y2 + W10;
                            i18 += U8;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 12:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            int i26 = unsafe.getInt(abstractC0484u2, j5);
                            W10 = C0475k.W(i19);
                            Y2 = C0475k.Y(i26);
                            U8 = Y2 + W10;
                            i18 += U8;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 13:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W8 = C0475k.W(i19);
                            W12 = W8 + 4;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case 14:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            W11 = C0475k.W(i19);
                            W12 = W11 + 8;
                            i18 += W12;
                        }
                        j = this;
                        abstractC0484u2 = abstractC0484u;
                        i16 += 3;
                        i14 = 1048575;
                    case 15:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            int i27 = unsafe.getInt(abstractC0484u2, j5);
                            W10 = C0475k.W(i19);
                            Y2 = C0475k.X((i27 >> 31) ^ (i27 << 1));
                            U8 = Y2 + W10;
                            i18 += U8;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 16:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            long j10 = unsafe.getLong(abstractC0484u2, j5);
                            W9 = C0475k.W(i19);
                            Y = C0475k.Y((j10 >> 63) ^ (j10 << 1));
                            i18 += Y + W9;
                        }
                        j = this;
                        i16 += 3;
                        i14 = 1048575;
                    case 17:
                        if (j.o(abstractC0484u2, i16, i15, i17, i4)) {
                            a3 = ((AbstractC0465a) unsafe.getObject(abstractC0484u2, j5)).a(j.m(i16)) + (C0475k.W(i19) * 2);
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 18:
                        i8 = i15;
                        c6 = T.c(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 19:
                        i8 = i15;
                        c6 = T.b(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 20:
                        i9 = i15;
                        i10 = i17;
                        List list = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls2 = T.f8637a;
                        if (list.size() != 0) {
                            W13 = (C0475k.W(i19) * list.size()) + T.e(list);
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 21:
                        i9 = i15;
                        i10 = i17;
                        List list2 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls3 = T.f8637a;
                        size = list2.size();
                        if (size != 0) {
                            i11 = T.i(list2);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 22:
                        i9 = i15;
                        i10 = i17;
                        List list3 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls4 = T.f8637a;
                        size = list3.size();
                        if (size != 0) {
                            i11 = T.d(list3);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 23:
                        i8 = i15;
                        c6 = T.c(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 24:
                        i8 = i15;
                        c6 = T.b(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 25:
                        i9 = i15;
                        i10 = i17;
                        List list4 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls5 = T.f8637a;
                        int size5 = list4.size();
                        if (size5 == 0) {
                            W15 = 0;
                        } else {
                            W15 = (C0475k.W(i19) + 1) * size5;
                        }
                        i18 += W15;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 26:
                        i9 = i15;
                        i10 = i17;
                        List list5 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls6 = T.f8637a;
                        int size6 = list5.size();
                        if (size6 != 0) {
                            W13 = C0475k.W(i19) * size6;
                            for (int i28 = 0; i28 < size6; i28++) {
                                Object obj = list5.get(i28);
                                if (obj instanceof C0471g) {
                                    int size7 = ((C0471g) obj).size();
                                    W13 = C0475k.X(size7) + size7 + W13;
                                } else {
                                    W13 = C0475k.V((String) obj) + W13;
                                }
                            }
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 27:
                        i9 = i15;
                        i10 = i17;
                        List list6 = (List) unsafe.getObject(abstractC0484u2, j5);
                        S m8 = j.m(i16);
                        Class cls7 = T.f8637a;
                        int size8 = list6.size();
                        if (size8 == 0) {
                            W16 = 0;
                        } else {
                            W16 = C0475k.W(i19) * size8;
                            for (int i29 = 0; i29 < size8; i29++) {
                                int a9 = ((AbstractC0465a) list6.get(i29)).a(m8);
                                W16 += C0475k.X(a9) + a9;
                            }
                        }
                        i18 += W16;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 28:
                        i9 = i15;
                        i10 = i17;
                        List list7 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls8 = T.f8637a;
                        int size9 = list7.size();
                        if (size9 != 0) {
                            W13 = C0475k.W(i19) * size9;
                            for (int i30 = 0; i30 < list7.size(); i30++) {
                                int size10 = ((C0471g) list7.get(i30)).size();
                                W13 += C0475k.X(size10) + size10;
                            }
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 29:
                        i9 = i15;
                        i10 = i17;
                        List list8 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls9 = T.f8637a;
                        size = list8.size();
                        if (size != 0) {
                            i11 = T.h(list8);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 30:
                        i9 = i15;
                        i10 = i17;
                        List list9 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls10 = T.f8637a;
                        size = list9.size();
                        if (size != 0) {
                            i11 = T.a(list9);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 31:
                        i8 = i15;
                        c6 = T.b(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 32:
                        i8 = i15;
                        c6 = T.c(i19, (List) unsafe.getObject(abstractC0484u2, j5));
                        i18 += c6;
                        i15 = i8;
                        i16 += 3;
                        i14 = 1048575;
                    case 33:
                        i9 = i15;
                        i10 = i17;
                        List list10 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls11 = T.f8637a;
                        size = list10.size();
                        if (size != 0) {
                            i11 = T.f(list10);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 34:
                        i9 = i15;
                        i10 = i17;
                        List list11 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls12 = T.f8637a;
                        size = list11.size();
                        if (size != 0) {
                            i11 = T.g(list11);
                            W14 = C0475k.W(i19);
                            W13 = (W14 * size) + i11;
                            i18 += W13;
                            i15 = i9;
                            i17 = i10;
                            i16 += 3;
                            i14 = 1048575;
                        }
                        W13 = 0;
                        i18 += W13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 35:
                        i9 = i15;
                        i10 = i17;
                        List list12 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls13 = T.f8637a;
                        size2 = list12.size() * 8;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 36:
                        i9 = i15;
                        i10 = i17;
                        List list13 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls14 = T.f8637a;
                        size2 = list13.size() * 4;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 37:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.e((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 38:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.i((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 39:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.d((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 40:
                        i9 = i15;
                        i10 = i17;
                        List list14 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls15 = T.f8637a;
                        size2 = list14.size() * 8;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 41:
                        i9 = i15;
                        i10 = i17;
                        List list15 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls16 = T.f8637a;
                        size2 = list15.size() * 4;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 42:
                        i9 = i15;
                        i10 = i17;
                        List list16 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls17 = T.f8637a;
                        size2 = list16.size();
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 43:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.h((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 44:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.a((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 45:
                        i9 = i15;
                        i10 = i17;
                        List list17 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls18 = T.f8637a;
                        size2 = list17.size() * 4;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 46:
                        i9 = i15;
                        i10 = i17;
                        List list18 = (List) unsafe.getObject(abstractC0484u2, j5);
                        Class cls19 = T.f8637a;
                        size2 = list18.size() * 8;
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 47:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.f((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 48:
                        i9 = i15;
                        i10 = i17;
                        size2 = T.g((List) unsafe.getObject(abstractC0484u2, j5));
                        if (size2 > 0) {
                            W17 = C0475k.W(i19);
                            X8 = C0475k.X(size2);
                            i18 += X8 + W17 + size2;
                        }
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 49:
                        i9 = i15;
                        i10 = i17;
                        List list19 = (List) unsafe.getObject(abstractC0484u2, j5);
                        S m9 = j.m(i16);
                        Class cls20 = T.f8637a;
                        int size11 = list19.size();
                        if (size11 == 0) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            for (int i31 = 0; i31 < size11; i31++) {
                                i12 += ((AbstractC0465a) list19.get(i31)).a(m9) + (C0475k.W(i19) * 2);
                            }
                        }
                        i18 += i12;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 50:
                        Object object3 = unsafe.getObject(abstractC0484u2, j5);
                        Object obj2 = j.f8612b[(i16 / 3) * 2];
                        j.f8621m.getClass();
                        E e9 = (E) object3;
                        D d2 = (D) obj2;
                        if (e9.isEmpty()) {
                            i13 = 0;
                        } else {
                            Iterator it2 = e9.entrySet().iterator();
                            i13 = 0;
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                d2.getClass();
                                int W22 = C0475k.W(i19);
                                C c10 = d2.f8601a;
                                char c11 = c9;
                                n0 n0Var2 = c10.f8598a;
                                int i32 = C0480p.f8730c;
                                int W23 = C0475k.W(i22);
                                int i33 = i22;
                                k0 k0Var = n0.f8714g;
                                if (n0Var2 == k0Var) {
                                    W23 *= 2;
                                }
                                int i34 = i15;
                                int i35 = i17;
                                switch (n0Var2.ordinal()) {
                                    case 0:
                                        it = it2;
                                        ((Double) key).getClass();
                                        Y8 = 8;
                                        int i36 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                            W24 *= 2;
                                        }
                                        switch (n0Var.ordinal()) {
                                            case 0:
                                                ((Double) value).getClass();
                                                Y9 = 8;
                                                int i37 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37) + i37 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 1:
                                                ((Float) value).getClass();
                                                Y9 = 4;
                                                int i372 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372) + i372 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                Y9 = C0475k.Y(((Long) value).longValue());
                                                int i3722 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i3722) + i3722 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                Y9 = C0475k.Y(((Long) value).longValue());
                                                int i37222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37222) + i37222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                Y9 = C0475k.Y(((Integer) value).intValue());
                                                int i372222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372222) + i372222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                                ((Long) value).getClass();
                                                Y9 = 8;
                                                int i3722222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i3722222) + i3722222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                                ((Integer) value).getClass();
                                                Y9 = 4;
                                                int i37222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37222222) + i37222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                                ((Boolean) value).getClass();
                                                Y9 = i33;
                                                int i372222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372222222) + i372222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                                if (value instanceof C0471g) {
                                                    size4 = ((C0471g) value).size();
                                                    X10 = C0475k.X(size4);
                                                    Y9 = size4 + X10;
                                                    int i3722222222 = Y9 + W24 + i36;
                                                    i13 += C0475k.X(i3722222222) + i3722222222 + W22;
                                                    it2 = it;
                                                    c9 = c11;
                                                    i22 = i33;
                                                    i15 = i34;
                                                    i17 = i35;
                                                } else {
                                                    Y9 = C0475k.V((String) value);
                                                    int i37222222222 = Y9 + W24 + i36;
                                                    i13 += C0475k.X(i37222222222) + i37222222222 + W22;
                                                    it2 = it;
                                                    c9 = c11;
                                                    i22 = i33;
                                                    i15 = i34;
                                                    i17 = i35;
                                                }
                                            case 9:
                                                Y9 = ((AbstractC0484u) ((AbstractC0465a) value)).a(null);
                                                int i372222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372222222222) + i372222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 10:
                                                size4 = ((AbstractC0484u) ((AbstractC0465a) value)).a(null);
                                                X10 = C0475k.X(size4);
                                                Y9 = size4 + X10;
                                                int i3722222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i3722222222222) + i3722222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 11:
                                                if (value instanceof C0471g) {
                                                    size4 = ((C0471g) value).size();
                                                    X10 = C0475k.X(size4);
                                                } else {
                                                    size4 = ((byte[]) value).length;
                                                    X10 = C0475k.X(size4);
                                                }
                                                Y9 = size4 + X10;
                                                int i37222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37222222222222) + i37222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 12:
                                                Y9 = C0475k.X(((Integer) value).intValue());
                                                int i372222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372222222222222) + i372222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 13:
                                                Y9 = C0475k.Y(((Integer) value).intValue());
                                                int i3722222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i3722222222222222) + i3722222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 14:
                                                ((Integer) value).getClass();
                                                Y9 = 4;
                                                int i37222222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37222222222222222) + i37222222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 15:
                                                ((Long) value).getClass();
                                                Y9 = 8;
                                                int i372222222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i372222222222222222) + i372222222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 16:
                                                int intValue = ((Integer) value).intValue();
                                                Y9 = C0475k.X((intValue >> 31) ^ (intValue << 1));
                                                int i3722222222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i3722222222222222222) + i3722222222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            case 17:
                                                long longValue = ((Long) value).longValue();
                                                Y9 = C0475k.Y((longValue >> c11) ^ (longValue << i33));
                                                int i37222222222222222222 = Y9 + W24 + i36;
                                                i13 += C0475k.X(i37222222222222222222) + i37222222222222222222 + W22;
                                                it2 = it;
                                                c9 = c11;
                                                i22 = i33;
                                                i15 = i34;
                                                i17 = i35;
                                            default:
                                                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                        }
                                    case 1:
                                        it = it2;
                                        ((Float) key).getClass();
                                        Y8 = 4;
                                        int i362 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        it = it2;
                                        Y8 = C0475k.Y(((Long) key).longValue());
                                        int i3622 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W2422 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        it = it2;
                                        Y8 = C0475k.Y(((Long) key).longValue());
                                        int i36222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                        it = it2;
                                        Y8 = C0475k.Y(((Integer) key).intValue());
                                        int i362222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                                        it = it2;
                                        ((Long) key).getClass();
                                        Y8 = 8;
                                        int i3622222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W2422222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                                        it = it2;
                                        ((Integer) key).getClass();
                                        Y8 = 4;
                                        int i36222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                                        it = it2;
                                        ((Boolean) key).getClass();
                                        Y8 = i33;
                                        int i362222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                                        it = it2;
                                        if (key instanceof C0471g) {
                                            size3 = ((C0471g) key).size();
                                            X9 = C0475k.X(size3);
                                            Y8 = X9 + size3;
                                            int i3622222222 = Y8 + W23;
                                            n0Var = c10.f8599b;
                                            int W2422222222 = C0475k.W(2);
                                            if (n0Var == k0Var) {
                                            }
                                            switch (n0Var.ordinal()) {
                                            }
                                        } else {
                                            Y8 = C0475k.V((String) key);
                                            int i36222222222 = Y8 + W23;
                                            n0Var = c10.f8599b;
                                            int W24222222222 = C0475k.W(2);
                                            if (n0Var == k0Var) {
                                            }
                                            switch (n0Var.ordinal()) {
                                            }
                                        }
                                    case 9:
                                        it = it2;
                                        Y8 = ((AbstractC0484u) ((AbstractC0465a) key)).a(null);
                                        int i362222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 10:
                                        it = it2;
                                        int a10 = ((AbstractC0484u) ((AbstractC0465a) key)).a(null);
                                        Y8 = C0475k.X(a10) + a10;
                                        int i3622222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W2422222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 11:
                                        it = it2;
                                        if (key instanceof C0471g) {
                                            size3 = ((C0471g) key).size();
                                            X9 = C0475k.X(size3);
                                        } else {
                                            size3 = ((byte[]) key).length;
                                            X9 = C0475k.X(size3);
                                        }
                                        Y8 = X9 + size3;
                                        int i36222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 12:
                                        it = it2;
                                        Y8 = C0475k.X(((Integer) key).intValue());
                                        int i362222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 13:
                                        it = it2;
                                        Y8 = C0475k.Y(((Integer) key).intValue());
                                        int i3622222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W2422222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 14:
                                        ((Integer) key).getClass();
                                        it = it2;
                                        Y8 = 4;
                                        int i36222222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24222222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 15:
                                        ((Long) key).getClass();
                                        it = it2;
                                        Y8 = 8;
                                        int i362222222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W242222222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 16:
                                        int intValue2 = ((Integer) key).intValue();
                                        Y8 = C0475k.X((intValue2 >> 31) ^ (intValue2 << 1));
                                        it = it2;
                                        int i3622222222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W2422222222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    case 17:
                                        long longValue2 = ((Long) key).longValue();
                                        Y8 = C0475k.Y((longValue2 << i33) ^ (longValue2 >> c11));
                                        it = it2;
                                        int i36222222222222222222 = Y8 + W23;
                                        n0Var = c10.f8599b;
                                        int W24222222222222222222 = C0475k.W(2);
                                        if (n0Var == k0Var) {
                                        }
                                        switch (n0Var.ordinal()) {
                                        }
                                    default:
                                        throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
                                }
                            }
                        }
                        i9 = i15;
                        i10 = i17;
                        i18 += i13;
                        i15 = i9;
                        i17 = i10;
                        i16 += 3;
                        i14 = 1048575;
                    case 51:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W7 = C0475k.W(i19);
                            a3 = W7 + 8;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 52:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W18 = C0475k.W(i19);
                            a3 = W18 + 4;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 53:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            long z8 = z(j5, abstractC0484u2);
                            W19 = C0475k.W(i19);
                            Y10 = C0475k.Y(z8);
                            X11 = Y10 + W19;
                            i18 += X11;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 54:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            long z9 = z(j5, abstractC0484u2);
                            W19 = C0475k.W(i19);
                            Y10 = C0475k.Y(z9);
                            X11 = Y10 + W19;
                            i18 += X11;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 55:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            int y4 = y(j5, abstractC0484u2);
                            W20 = C0475k.W(i19);
                            Y11 = C0475k.Y(y4);
                            a3 = Y11 + W20;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 56:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W7 = C0475k.W(i19);
                            a3 = W7 + 8;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 57:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W18 = C0475k.W(i19);
                            a3 = W18 + 4;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 58:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            a3 = C0475k.W(i19) + 1;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 59:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            Object object4 = unsafe.getObject(abstractC0484u2, j5);
                            if (object4 instanceof C0471g) {
                                V8 = C0475k.U(i19, (C0471g) object4);
                            } else {
                                V8 = C0475k.V((String) object4) + C0475k.W(i19);
                            }
                            i18 = V8 + i18;
                        }
                        i16 += 3;
                        i14 = 1048575;
                    case 60:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            Object object5 = unsafe.getObject(abstractC0484u2, j5);
                            S m10 = j.m(i16);
                            Class cls21 = T.f8637a;
                            int W25 = C0475k.W(i19);
                            int a11 = ((AbstractC0465a) object5).a(m10);
                            X11 = C0475k.X(a11) + a11 + W25;
                            i18 += X11;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 61:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            a3 = C0475k.U(i19, (C0471g) unsafe.getObject(abstractC0484u2, j5));
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 62:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            int y5 = y(j5, abstractC0484u2);
                            W20 = C0475k.W(i19);
                            Y11 = C0475k.X(y5);
                            a3 = Y11 + W20;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 63:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            int y8 = y(j5, abstractC0484u2);
                            W20 = C0475k.W(i19);
                            Y11 = C0475k.Y(y8);
                            a3 = Y11 + W20;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 64:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W18 = C0475k.W(i19);
                            a3 = W18 + 4;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 65:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            W7 = C0475k.W(i19);
                            a3 = W7 + 8;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 66:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            int y9 = y(j5, abstractC0484u2);
                            W20 = C0475k.W(i19);
                            Y11 = C0475k.X((y9 >> 31) ^ (y9 << 1));
                            a3 = Y11 + W20;
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 67:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            long z10 = z(j5, abstractC0484u2);
                            W19 = C0475k.W(i19);
                            Y10 = C0475k.Y((z10 << 1) ^ (z10 >> 63));
                            X11 = Y10 + W19;
                            i18 += X11;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    case 68:
                        if (j.q(abstractC0484u2, i19, i16)) {
                            a3 = ((AbstractC0465a) unsafe.getObject(abstractC0484u2, j5)).a(j.m(i16)) + (C0475k.W(i19) * 2);
                            i18 += a3;
                            i16 += 3;
                            i14 = 1048575;
                        } else {
                            i16 += 3;
                            i14 = 1048575;
                        }
                    default:
                        i16 += 3;
                        i14 = 1048575;
                }
            } else {
                ((a0) j.f8620l).getClass();
                return abstractC0484u2.unknownFields.b() + i18;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.S
    public final AbstractC0484u i() {
        this.j.getClass();
        return ((AbstractC0484u) this.f8615e).i();
    }

    public final boolean j(AbstractC0484u abstractC0484u, AbstractC0484u abstractC0484u2, int i4) {
        if (n(i4, abstractC0484u) == n(i4, abstractC0484u2)) {
            return true;
        }
        return false;
    }

    public final void k(Object obj, int i4, Object obj2) {
        int i8 = this.f8611a[i4];
        if (f0.f8676c.h(L(i4) & 1048575, obj) == null) {
            return;
        }
        l(i4);
    }

    public final void l(int i4) {
        if (this.f8612b[((i4 / 3) * 2) + 1] == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final S m(int i4) {
        int i8 = (i4 / 3) * 2;
        Object[] objArr = this.f8612b;
        S s8 = (S) objArr[i8];
        if (s8 != null) {
            return s8;
        }
        S a3 = O.f8627c.a((Class) objArr[i8 + 1]);
        objArr[i8] = a3;
        return a3;
    }

    public final boolean n(int i4, Object obj) {
        int i8 = this.f8611a[i4 + 2];
        long j = i8 & 1048575;
        if (j == 1048575) {
            int L8 = L(i4);
            long j5 = L8 & 1048575;
            switch (K(L8)) {
                case 0:
                    if (Double.doubleToRawLongBits(f0.f8676c.d(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(f0.f8676c.e(j5, obj)) == 0) {
                        return false;
                    }
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    if (f0.f8676c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    if (f0.f8676c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    if (f0.f8676c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    return f0.f8676c.c(j5, obj);
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    Object h8 = f0.f8676c.h(j5, obj);
                    if (h8 instanceof String) {
                        return !((String) h8).isEmpty();
                    }
                    if (h8 instanceof C0471g) {
                        return !C0471g.f8681f.equals(h8);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (f0.f8676c.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C0471g.f8681f.equals(f0.f8676c.h(j5, obj));
                case 11:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (f0.f8676c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (f0.f8676c.f(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (f0.f8676c.g(j5, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (f0.f8676c.h(j5, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i8 >>> 20)) & f0.f8676c.f(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean o(Object obj, int i4, int i8, int i9, int i10) {
        if (i8 == 1048575) {
            return n(i4, obj);
        }
        if ((i9 & i10) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(Object obj, int i4, int i8) {
        if (f0.f8676c.f(this.f8611a[i8 + 2] & 1048575, obj) == i4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
    
        r10.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i4, Object obj2, C0477m c0477m, C0474j c0474j) {
        long L8 = L(i4) & 1048575;
        Object h8 = f0.f8676c.h(L8, obj);
        F f8 = this.f8621m;
        if (h8 == null) {
            f8.getClass();
            h8 = E.f8603e.b();
            f0.o(obj, L8, h8);
        } else {
            f8.getClass();
            if (!((E) h8).f8604d) {
                E b4 = E.f8603e.b();
                F.a(b4, h8);
                f0.o(obj, L8, b4);
                h8 = b4;
            }
        }
        f8.getClass();
        E e9 = (E) h8;
        C c6 = ((D) obj2).f8601a;
        c0474j.w(2);
        b8.c cVar = c0474j.f8701a;
        int e10 = cVar.e(cVar.v());
        Object obj3 = c6.f8600c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a3 = c0474j.a();
                if (a3 == Integer.MAX_VALUE || cVar.c()) {
                    break;
                }
                if (a3 != 1) {
                    if (a3 != 2) {
                        try {
                            if (!c0474j.x()) {
                                throw new IOException("Unable to parse map entry.");
                                break;
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!c0474j.x()) {
                                throw new IOException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj5 = c0474j.i(c6.f8599b, obj3.getClass(), c0477m);
                    }
                } else {
                    obj4 = c0474j.i(c6.f8598a, null, null);
                }
            } catch (Throwable th) {
                cVar.d(e10);
                throw th;
            }
        }
    }

    public final void s(Object obj, int i4, Object obj2) {
        if (!n(i4, obj2)) {
            return;
        }
        long L8 = L(i4) & 1048575;
        Unsafe unsafe = f8610o;
        Object object = unsafe.getObject(obj2, L8);
        if (object != null) {
            S m6 = m(i4);
            if (!n(i4, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L8, object);
                } else {
                    AbstractC0484u i8 = m6.i();
                    m6.a(i8, object);
                    unsafe.putObject(obj, L8, i8);
                }
                G(i4, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L8);
            if (!p(object2)) {
                AbstractC0484u i9 = m6.i();
                m6.a(i9, object2);
                unsafe.putObject(obj, L8, i9);
                object2 = i9;
            }
            m6.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f8611a[i4] + " is present but null: " + obj2);
    }

    public final void t(Object obj, int i4, Object obj2) {
        int[] iArr = this.f8611a;
        int i8 = iArr[i4];
        if (!q(obj2, i8, i4)) {
            return;
        }
        long L8 = L(i4) & 1048575;
        Unsafe unsafe = f8610o;
        Object object = unsafe.getObject(obj2, L8);
        if (object != null) {
            S m6 = m(i4);
            if (!q(obj, i8, i4)) {
                if (!p(object)) {
                    unsafe.putObject(obj, L8, object);
                } else {
                    AbstractC0484u i9 = m6.i();
                    m6.a(i9, object);
                    unsafe.putObject(obj, L8, i9);
                }
                H(obj, i8, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, L8);
            if (!p(object2)) {
                AbstractC0484u i10 = m6.i();
                m6.a(i10, object2);
                unsafe.putObject(obj, L8, i10);
                object2 = i10;
            }
            m6.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + iArr[i4] + " is present but null: " + obj2);
    }

    public final Object u(int i4, Object obj) {
        S m6 = m(i4);
        long L8 = L(i4) & 1048575;
        if (!n(i4, obj)) {
            return m6.i();
        }
        Object object = f8610o.getObject(obj, L8);
        if (p(object)) {
            return object;
        }
        AbstractC0484u i8 = m6.i();
        if (object != null) {
            m6.a(i8, object);
        }
        return i8;
    }

    public final Object v(Object obj, int i4, int i8) {
        S m6 = m(i8);
        if (!q(obj, i4, i8)) {
            return m6.i();
        }
        Object object = f8610o.getObject(obj, L(i8) & 1048575);
        if (p(object)) {
            return object;
        }
        AbstractC0484u i9 = m6.i();
        if (object != null) {
            m6.a(i9, object);
        }
        return i9;
    }
}
