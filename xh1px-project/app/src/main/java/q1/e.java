package q1;

import L7.AbstractC0160s;
import L7.AbstractC0166y;
import R3.r;
import android.graphics.Bitmap;
import android.util.Log;
import d6.C0623i;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C1353a f13923a;

    /* renamed from: b, reason: collision with root package name */
    public final r f13924b;

    public e(C1353a c1353a, r rVar) {
        this.f13923a = c1353a;
        this.f13924b = rVar;
    }

    public final Bitmap a(String str, int i4, int i8) {
        Object t8;
        o6.j.e(str, "path");
        int i9 = C1353a.f13911a;
        String str2 = "key:IMAGE_CONDITION:" + str + ":" + i4 + ":" + i8;
        C1353a c1353a = this.f13923a;
        Bitmap bitmap = (Bitmap) c1353a.get(str2);
        if (bitmap == null) {
            t8 = AbstractC0166y.t(C0623i.f10448d, new C1354b(this, str, i4, i8, null));
            Bitmap bitmap2 = (Bitmap) t8;
            if (bitmap2 != null) {
                c1353a.put(str2, bitmap2);
                return bitmap2;
            }
            return null;
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, int i4, int i8, AbstractC0713c abstractC0713c) {
        c cVar;
        int i9;
        String str2;
        int i10;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        Object Z8;
        if (abstractC0713c instanceof c) {
            cVar = (c) abstractC0713c;
            int i12 = cVar.f13919m;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f13919m = i12 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.k;
                i9 = cVar2.f13919m;
                r rVar = this.f13924b;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i9 == 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 == 3) {
                                Z5.a.d(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i11 = cVar2.j;
                        i10 = cVar2.f13917i;
                        bitmap2 = cVar2.f13916h;
                        Z5.a.d(obj);
                        cVar2.f13915g = null;
                        cVar2.f13916h = null;
                        cVar2.f13917i = i10;
                        cVar2.j = i11;
                        cVar2.f13919m = 3;
                        Z8 = rVar.Z(bitmap2, "Condition_", cVar2);
                        if (Z8 != enumC0646a) {
                            return enumC0646a;
                        }
                        return Z8;
                    }
                    i11 = cVar2.j;
                    i10 = cVar2.f13917i;
                    str2 = cVar2.f13915g;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    cVar2.f13915g = str;
                    cVar2.f13917i = i4;
                    cVar2.j = i8;
                    cVar2.f13919m = 1;
                    File file = new File((File) rVar.f5083f, str);
                    if (!file.exists()) {
                        Log.e("ConditionBitmapsDataSource", "Invalid path " + str + ", bitmap file can't be found.");
                        obj = null;
                    } else {
                        obj = AbstractC0166y.A((AbstractC0160s) rVar.f5082e, new i(file, str, i4, i8, null), cVar2);
                    }
                    if (obj != enumC0646a) {
                        str2 = str;
                        i10 = i4;
                        i11 = i8;
                    }
                    return enumC0646a;
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    return null;
                }
                List y4 = E2.d.y(str2);
                cVar2.f13915g = null;
                cVar2.f13916h = bitmap;
                cVar2.f13917i = i10;
                cVar2.j = i11;
                cVar2.f13919m = 2;
                if (rVar.y(y4, cVar2) != enumC0646a) {
                    bitmap2 = bitmap;
                    cVar2.f13915g = null;
                    cVar2.f13916h = null;
                    cVar2.f13917i = i10;
                    cVar2.j = i11;
                    cVar2.f13919m = 3;
                    Z8 = rVar.Z(bitmap2, "Condition_", cVar2);
                    if (Z8 != enumC0646a) {
                    }
                }
                return enumC0646a;
            }
        }
        cVar = new c(this, abstractC0713c);
        c cVar22 = cVar;
        Object obj2 = cVar22.k;
        i9 = cVar22.f13919m;
        r rVar2 = this.f13924b;
        EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
        if (i9 == 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Bitmap bitmap, String str, AbstractC0713c abstractC0713c) {
        d dVar;
        int i4;
        if (abstractC0713c instanceof d) {
            dVar = (d) abstractC0713c;
            int i8 = dVar.j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar.j = i8 - Integer.MIN_VALUE;
                Object obj = dVar.f13921h;
                i4 = dVar.j;
                if (i4 == 0) {
                    if (i4 == 1) {
                        bitmap = dVar.f13920g;
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    dVar.f13920g = bitmap;
                    dVar.j = 1;
                    obj = this.f13924b.Z(bitmap, str, dVar);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                String str2 = (String) obj;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                o6.j.e(str2, "path");
                int i9 = C1353a.f13911a;
                this.f13923a.put("key:IMAGE_CONDITION:" + str2 + ":" + width + ":" + height, bitmap);
                return str2;
            }
        }
        dVar = new d(this, abstractC0713c);
        Object obj2 = dVar.f13921h;
        i4 = dVar.j;
        if (i4 == 0) {
        }
        String str22 = (String) obj2;
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        o6.j.e(str22, "path");
        int i92 = C1353a.f13911a;
        this.f13923a.put("key:IMAGE_CONDITION:" + str22 + ":" + width2 + ":" + height2, bitmap);
        return str22;
    }
}
