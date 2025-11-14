package T6;

import java.util.ArrayList;
import java.util.List;
import n1.AbstractC1149a;
import w7.AbstractC1759v;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1759v f5902a;

    /* renamed from: b, reason: collision with root package name */
    public final List f5903b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5904c;

    /* renamed from: d, reason: collision with root package name */
    public final List f5905d;

    public z(AbstractC1759v abstractC1759v, List list, ArrayList arrayList, List list2) {
        this.f5902a = abstractC1759v;
        this.f5903b = list;
        this.f5904c = arrayList;
        this.f5905d = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z) {
                z zVar = (z) obj;
                if (!this.f5902a.equals(zVar.f5902a) || !this.f5903b.equals(zVar.f5903b) || !this.f5904c.equals(zVar.f5904c) || !this.f5905d.equals(zVar.f5905d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5905d.hashCode() + AbstractC1149a.c((this.f5904c.hashCode() + ((this.f5903b.hashCode() + (this.f5902a.hashCode() * 961)) * 31)) * 31, 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f5902a + ", receiverType=null, valueParameters=" + this.f5903b + ", typeParameters=" + this.f5904c + ", hasStableParameterNames=false, errors=" + this.f5905d + ')';
    }
}
