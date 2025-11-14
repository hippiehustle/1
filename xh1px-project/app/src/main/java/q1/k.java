package q1;

import L7.InterfaceC0163v;
import Z5.y;
import android.graphics.Bitmap;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.io.File;
import java.io.FileOutputStream;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ File f13937h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Bitmap f13938i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(File file, Bitmap bitmap, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f13937h = file;
        this.f13938i = bitmap;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new k(this.f13937h, this.f13938i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Z5.a.d(obj);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f13937h);
        try {
            Boolean valueOf = Boolean.valueOf(this.f13938i.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream));
            fileOutputStream.close();
            return valueOf;
        } finally {
        }
    }
}
