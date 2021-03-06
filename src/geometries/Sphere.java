package geometries;

import primitives.Point3D;
import primitives.Vector;
import primitives.*;

public class Sphere extends RadialGeometry {
    Point3D _center;

    public Sphere(double _radius, Point3D _center) {
        super(_radius);
        this._center = new Point3D(this.get_center());
    }
    public Sphere(RadialGeometry other, Point3D _center) {
        super(other);
        this._center = new Point3D(this.get_center());
    }

    public Point3D get_center() {
        return new Point3D(_center.get_x(),_center.get_y(),_center.get_z());
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                ", _radius=" + _radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if (!(o instanceof Sphere)) return  false;
        Sphere other = (Sphere) o;
        return this._center.equals(other._center) && (Util.isZero(this._radius - other._radius));
    }

    @Override
    public Vector getNormal(Point3D _point3D) {
        return null;
    }
}
