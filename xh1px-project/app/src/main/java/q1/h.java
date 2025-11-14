package q1;

import L7.InterfaceC0163v;
import R3.r;
import Z5.y;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.io.File;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ File f13930h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13931i;
    public final /* synthetic */ int j;
    public final /* synthetic */ r k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, int i4, int i8, r rVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13930h = file;
        this.f13931i = i4;
        this.j = i8;
        this.k = rVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new h(this.f13930h, this.f13931i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        File file = this.f13930h;
        Z5.a.d(obj);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i4 = 1;
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            int i8 = options.outWidth;
            int i9 = options.outHeight;
            r rVar = this.k;
            int i10 = this.f13931i;
            int i11 = this.j;
            rVar.getClass();
            if (i10 != 0 && i11 != 0 && (i9 > i11 || i8 > i10)) {
                int i12 = i9 / 2;
                int i13 = i8 / 2;
                while (i12 / i4 >= i11 && i13 / i4 >= i10) {
                    i4 *= 2;
                }
            }
            options.inSampleSize = i4;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            decodeFile.getWidth();
            decodeFile.getHeight();
            return decodeFile;
        } catch (Exception unused) {
            Log.e("ConditionBitmapsDataSource", "Can't load image, size is invalid");
            return null;
        }
    }
}
