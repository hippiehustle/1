package C7;

import X0.D;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p implements D {

    /* renamed from: a, reason: collision with root package name */
    public int f818a;

    @Override // X0.D
    public Object a(Y0.c cVar, float f8) {
        boolean z8;
        int i4;
        float f9;
        int i8;
        int argb;
        float f10;
        ArrayList arrayList = new ArrayList();
        int i9 = 1;
        int i10 = 0;
        if (cVar.D() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            cVar.a();
        }
        while (cVar.p()) {
            arrayList.add(Float.valueOf((float) cVar.y()));
        }
        int i11 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f818a = 2;
        }
        if (z8) {
            cVar.e();
        }
        if (this.f818a == -1) {
            this.f818a = arrayList.size() / 4;
        }
        int i12 = this.f818a;
        float[] fArr = new float[i12];
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i4 = this.f818a * 4;
            if (i13 >= i4) {
                break;
            }
            int i16 = i13 / 4;
            double floatValue = ((Float) arrayList.get(i13)).floatValue();
            int i17 = i10;
            int i18 = i13 % 4;
            if (i18 != 0) {
                if (i18 != i9) {
                    if (i18 != 2) {
                        if (i18 == 3) {
                            iArr[i16] = Color.argb(255, i14, i15, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i15 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i14 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i16 > 0) {
                    float f11 = (float) floatValue;
                    if (fArr[i16 - 1] >= f11) {
                        fArr[i16] = f11 + 0.01f;
                    }
                }
                fArr[i16] = (float) floatValue;
            }
            i13++;
            i10 = i17;
            i9 = 1;
        }
        int i19 = i10;
        U0.c cVar2 = new U0.c(fArr, iArr);
        if (arrayList.size() <= i4) {
            return cVar2;
        }
        int size = (arrayList.size() - i4) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i20 = i19;
        while (i4 < arrayList.size()) {
            if (i4 % 2 == 0) {
                fArr2[i20] = ((Float) arrayList.get(i4)).floatValue();
            } else {
                fArr3[i20] = ((Float) arrayList.get(i4)).floatValue();
                i20++;
            }
            i4++;
        }
        float[] fArr4 = cVar2.f5943a;
        if (fArr4.length == 0) {
            fArr4 = fArr2;
        } else if (size != 0) {
            int length = fArr4.length + size;
            float[] fArr5 = new float[length];
            int i21 = i19;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            while (i21 < length) {
                float f12 = Float.NaN;
                if (i23 < fArr4.length) {
                    f9 = fArr4[i23];
                } else {
                    f9 = Float.NaN;
                }
                if (i24 < size) {
                    f12 = fArr2[i24];
                }
                if (!Float.isNaN(f12) && f9 >= f12) {
                    if (!Float.isNaN(f9) && f12 >= f9) {
                        fArr5[i21] = f9;
                        i23++;
                        i24++;
                        i22++;
                    } else {
                        fArr5[i21] = f12;
                        i24++;
                    }
                } else {
                    fArr5[i21] = f9;
                    i23++;
                }
                i21++;
            }
            if (i22 == 0) {
                fArr4 = fArr5;
            } else {
                fArr4 = Arrays.copyOf(fArr5, length - i22);
            }
        }
        int length2 = fArr4.length;
        int[] iArr2 = new int[length2];
        int i25 = i19;
        while (i25 < length2) {
            float f13 = fArr4[i25];
            int binarySearch = Arrays.binarySearch(fArr, f13);
            int binarySearch2 = Arrays.binarySearch(fArr2, f13);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                int i26 = iArr[binarySearch];
                if (size >= i11 && f13 > fArr2[i19]) {
                    for (int i27 = 1; i27 < size; i27++) {
                        float f14 = fArr2[i27];
                        if (f14 >= f13 || i27 == size - 1) {
                            if (f14 <= f13) {
                                f10 = fArr3[i27];
                            } else {
                                int i28 = i27 - 1;
                                float f15 = fArr2[i28];
                                f10 = Z0.g.f(fArr3[i28], fArr3[i27], (f13 - f15) / (f14 - f15));
                            }
                            argb = Color.argb((int) (f10 * 255.0f), Color.red(i26), Color.green(i26), Color.blue(i26));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                argb = Color.argb((int) (fArr3[i19] * 255.0f), Color.red(i26), Color.green(i26), Color.blue(i26));
                iArr2[i25] = argb;
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f16 = fArr3[binarySearch2];
                if (i12 >= 2 && f13 != fArr[i19]) {
                    for (int i29 = 1; i29 < i12; i29++) {
                        float f17 = fArr[i29];
                        if (f17 >= f13 || i29 == i12 - 1) {
                            if (i29 == i12 - 1 && f13 >= f17) {
                                i8 = Color.argb((int) (f16 * 255.0f), Color.red(iArr[i29]), Color.green(iArr[i29]), Color.blue(iArr[i29]));
                            } else {
                                int i30 = i29 - 1;
                                float f18 = fArr[i30];
                                int m6 = E2.d.m((f13 - f18) / (f17 - f18), iArr[i30], iArr[i29]);
                                i8 = Color.argb((int) (f16 * 255.0f), Color.red(m6), Color.green(m6), Color.blue(m6));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i8 = iArr[i19];
                iArr2[i25] = i8;
            }
            i25++;
            i11 = 2;
        }
        return new U0.c(fArr4, iArr2);
    }
}
