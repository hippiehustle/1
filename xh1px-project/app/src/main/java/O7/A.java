package O7;

import d6.InterfaceC0617c;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* loaded from: classes.dex */
public final class A implements InterfaceC0234g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o6.u f4055e;

    public /* synthetic */ A(o6.u uVar, int i4) {
        this.f4054d = i4;
        this.f4055e = uVar;
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        switch (this.f4054d) {
            case 0:
                this.f4055e.f13642d = obj;
                throw new AbortFlowException(this);
            default:
                this.f4055e.f13642d = obj;
                throw new AbortFlowException(this);
        }
    }
}
