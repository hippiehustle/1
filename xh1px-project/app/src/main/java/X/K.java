package X;

import java.io.File;
import n6.InterfaceC1163b;

/* loaded from: classes.dex */
public final class K extends o6.l implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final K f6670e = new o6.l(1);

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        File file = (File) obj;
        o6.j.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        o6.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new b0(absolutePath);
    }
}
