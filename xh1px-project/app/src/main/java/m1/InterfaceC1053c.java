package m1;

import l1.C0999a;

/* renamed from: m1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1053c {
    Long a();

    default long c() {
        boolean z8;
        if (getId().f12187a != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return getId().f12187a;
        }
        Long l6 = getId().f12188b;
        if (l6 != null) {
            return l6.longValue();
        }
        throw new IllegalStateException("Identifier is invalid");
    }

    C0999a getId();
}
