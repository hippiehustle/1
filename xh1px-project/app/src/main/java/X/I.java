package X;

import f6.AbstractC0713c;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class I extends AbstractC0713c {

    /* renamed from: g, reason: collision with root package name */
    public Object f6665g;

    /* renamed from: h, reason: collision with root package name */
    public FileInputStream f6666h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f6667i;
    public final /* synthetic */ J j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j, AbstractC0713c abstractC0713c) {
        super(abstractC0713c);
        this.j = j;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        this.f6667i = obj;
        this.k |= Integer.MIN_VALUE;
        return J.a(this.j, this);
    }
}
