package u6;

import a6.AbstractC0438m;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w6.p0;
import w6.s0;

/* loaded from: classes.dex */
public final class z implements TypeVariable, Type {

    /* renamed from: d, reason: collision with root package name */
    public final t f15383d;

    public z(t tVar) {
        o6.j.e(tVar, "typeParameter");
        this.f15383d = tVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof TypeVariable) && getName().equals(((TypeVariable) obj).getName())) {
            getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        s0 s0Var = ((p0) this.f15383d).f15900e;
        s sVar = p0.f15898g[0];
        Object a3 = s0Var.a();
        o6.j.d(a3, "getValue(...)");
        List list = (List) a3;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC1638C.l((o6.k) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new Z5.i(A.j.o("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.f15383d));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return ((p0) this.f15383d).d();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }
}
