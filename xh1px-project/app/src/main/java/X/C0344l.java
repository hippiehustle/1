package X;

import java.io.File;
import java.util.LinkedHashSet;
import n6.InterfaceC1162a;

/* renamed from: X.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344l extends o6.l implements InterfaceC1162a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ H f6755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0344l(H h8, int i4) {
        super(0);
        this.f6754e = i4;
        this.f6755f = h8;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f6754e) {
            case 0:
                return ((O) this.f6755f.f6662m.getValue()).f6685b;
            default:
                L l6 = this.f6755f.f6655d;
                File canonicalFile = ((File) l6.f6674b.a()).getCanonicalFile();
                synchronized (L.f6672d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = L.f6671c;
                    if (!linkedHashSet.contains(absolutePath)) {
                        o6.j.d(absolutePath, "path");
                        linkedHashSet.add(absolutePath);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new O(canonicalFile, (b0) l6.f6673a.m(canonicalFile), new M1.e(10, canonicalFile));
        }
    }
}
