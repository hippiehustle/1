package q1;

import L7.InterfaceC0163v;
import Z5.y;
import android.graphics.Bitmap;
import android.util.Log;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ File f13932h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f13933i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(File file, String str, int i4, int i8, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13932h = file;
        this.f13933i = str;
        this.j = i4;
        this.k = i8;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f13932h, this.f13933i, this.j, this.k, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Bitmap bitmap;
        Z5.a.d(obj);
        FileInputStream fileInputStream = new FileInputStream(this.f13932h);
        int i4 = this.j;
        int i8 = this.k;
        try {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) fileInputStream.getChannel().size());
            fileInputStream.getChannel().read(allocateDirect);
            allocateDirect.position(0);
            try {
                bitmap = Bitmap.createBitmap(i4, i8, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(allocateDirect);
            } catch (RuntimeException unused) {
                Log.e("ConditionBitmapsDataSource", "Can't load image, size is invalid");
                bitmap = null;
            }
            fileInputStream.close();
            return bitmap;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                h2.a.b(fileInputStream, th);
                throw th2;
            }
        }
    }
}
